package com.google.ytd.db;

import java.util.Date;

public class Assignment {
  private String assignmentId = null;
  private String ytdDomain = null;
  private String status = null;
  private String description = null;
  private String playlistId = null;
  private Date created = null;
  private Date updated = null;
  private boolean isHeading = false;

  public Assignment(String ytdDomain, String assignmentId) {
    this.ytdDomain = ytdDomain;
    this.assignmentId = assignmentId;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setPlaylistId(String playlistId) {
    this.playlistId = playlistId;
  }

  public String getPlaylistId() {
    return playlistId;
  }

  public String getAssignmentId() {
    return assignmentId;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getCreated() {
    return created;
  }

  public void setYtdDomain(String ytdDomain) {
    this.ytdDomain = ytdDomain;
  }

  public String getYtdDomain() {
    return ytdDomain;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setHeading(boolean isHeading) {
    this.isHeading = isHeading;
  }

  public boolean isHeading() {
    return isHeading;
  }
  
  public Object clone() {
    Assignment clone = new Assignment(ytdDomain, assignmentId);
    clone.setStatus(status);
    clone.setDescription(description);
    clone.setPlaylistId(playlistId);
    clone.setCreated(created);
    
    return clone;
  }
  
}
