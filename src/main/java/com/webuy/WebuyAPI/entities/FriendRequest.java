package com.webuy.WebuyAPI.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class FriendRequest implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnoreProperties({ "friends", "sentFriendRequests", "receivedFriendRequests", "groups", "groupsCreate",
			"sentGroupInvitations", "receivedGroupInvitations" })
	@OneToOne
	private User sender;

	@JsonIgnoreProperties({ "friends", "sentFriendRequests", "receivedFriendRequests", "groups", "groupsCreate",
			"sentGroupInvitations", "receivedGroupInvitations" })
	@OneToOne
	private User receiver;

	public Long getId() {
		return id;
	}

	/*
	 * public void setId(Long id) { this.id = id; }
	 */

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

}
