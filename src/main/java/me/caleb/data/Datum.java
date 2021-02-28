
package me.caleb.data;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Serializable
{

    @SerializedName("all_awardings")
    @Expose
    private List<Object> allAwardings = null;
    @SerializedName("allow_live_comments")
    @Expose
    private Boolean allowLiveComments;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("author_flair_css_class")
    @Expose
    private Object authorFlairCssClass;
    @SerializedName("author_flair_richtext")
    @Expose
    private List<Object> authorFlairRichtext = null;
    @SerializedName("author_flair_text")
    @Expose
    private Object authorFlairText;
    @SerializedName("author_flair_type")
    @Expose
    private String authorFlairType;
    @SerializedName("author_fullname")
    @Expose
    private String authorFullname;
    @SerializedName("author_patreon_flair")
    @Expose
    private Boolean authorPatreonFlair;
    @SerializedName("author_premium")
    @Expose
    private Boolean authorPremium;
    @SerializedName("awarders")
    @Expose
    private List<Object> awarders = null;
    @SerializedName("can_mod_post")
    @Expose
    private Boolean canModPost;
    @SerializedName("contest_mode")
    @Expose
    private Boolean contestMode;
    @SerializedName("created_utc")
    @Expose
    private Integer createdUtc;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("full_link")
    @Expose
    private String fullLink;
    @SerializedName("gildings")
    @Expose
    private Gildings gildings;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_crosspostable")
    @Expose
    private Boolean isCrosspostable;
    @SerializedName("is_meta")
    @Expose
    private Boolean isMeta;
    @SerializedName("is_original_content")
    @Expose
    private Boolean isOriginalContent;
    @SerializedName("is_reddit_media_domain")
    @Expose
    private Boolean isRedditMediaDomain;
    @SerializedName("is_robot_indexable")
    @Expose
    private Boolean isRobotIndexable;
    @SerializedName("is_self")
    @Expose
    private Boolean isSelf;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("link_flair_background_color")
    @Expose
    private String linkFlairBackgroundColor;
    @SerializedName("link_flair_css_class")
    @Expose
    private String linkFlairCssClass;
    @SerializedName("link_flair_richtext")
    @Expose
    private List<LinkFlairRichtext> linkFlairRichtext = null;
    @SerializedName("link_flair_template_id")
    @Expose
    private String linkFlairTemplateId;
    @SerializedName("link_flair_text")
    @Expose
    private String linkFlairText;
    @SerializedName("link_flair_text_color")
    @Expose
    private String linkFlairTextColor;
    @SerializedName("link_flair_type")
    @Expose
    private String linkFlairType;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("media_embed")
    @Expose
    private MediaEmbed mediaEmbed;
    @SerializedName("media_only")
    @Expose
    private Boolean mediaOnly;
    @SerializedName("no_follow")
    @Expose
    private Boolean noFollow;
    @SerializedName("num_comments")
    @Expose
    private Integer numComments;
    @SerializedName("num_crossposts")
    @Expose
    private Integer numCrossposts;
    @SerializedName("over_18")
    @Expose
    private Boolean over18;
    @SerializedName("parent_whitelist_status")
    @Expose
    private String parentWhitelistStatus;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("post_hint")
    @Expose
    private String postHint;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("pwls")
    @Expose
    private Integer pwls;
    @SerializedName("removed_by_category")
    @Expose
    private String removedByCategory;
    @SerializedName("retrieved_on")
    @Expose
    private Integer retrievedOn;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("secure_media")
    @Expose
    private SecureMedia secureMedia;
    @SerializedName("secure_media_embed")
    @Expose
    private SecureMediaEmbed secureMediaEmbed;
    @SerializedName("selftext")
    @Expose
    private String selftext;
    @SerializedName("send_replies")
    @Expose
    private Boolean sendReplies;
    @SerializedName("spoiler")
    @Expose
    private Boolean spoiler;
    @SerializedName("stickied")
    @Expose
    private Boolean stickied;
    @SerializedName("subreddit")
    @Expose
    private String subreddit;
    @SerializedName("subreddit_id")
    @Expose
    private String subredditId;
    @SerializedName("subreddit_subscribers")
    @Expose
    private Integer subredditSubscribers;
    @SerializedName("subreddit_type")
    @Expose
    private String subredditType;
    @SerializedName("suggested_sort")
    @Expose
    private String suggestedSort;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("thumbnail_height")
    @Expose
    private Integer thumbnailHeight;
    @SerializedName("thumbnail_width")
    @Expose
    private Integer thumbnailWidth;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("total_awards_received")
    @Expose
    private Integer totalAwardsReceived;
    @SerializedName("treatment_tags")
    @Expose
    private List<Object> treatmentTags = null;
    @SerializedName("upvote_ratio")
    @Expose
    private Double upvoteRatio;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("url_overridden_by_dest")
    @Expose
    private String urlOverriddenByDest;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("wls")
    @Expose
    private Integer wls;
    private final static long serialVersionUID = 5771517836116421051L;

    public List<Object> getAllAwardings() {
        return allAwardings;
    }

    public void setAllAwardings(List<Object> allAwardings) {
        this.allAwardings = allAwardings;
    }

    public Boolean getAllowLiveComments() {
        return allowLiveComments;
    }

    public void setAllowLiveComments(Boolean allowLiveComments) {
        this.allowLiveComments = allowLiveComments;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(Object authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public List<Object> getAuthorFlairRichtext() {
        return authorFlairRichtext;
    }

    public void setAuthorFlairRichtext(List<Object> authorFlairRichtext) {
        this.authorFlairRichtext = authorFlairRichtext;
    }

    public Object getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(Object authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public String getAuthorFlairType() {
        return authorFlairType;
    }

    public void setAuthorFlairType(String authorFlairType) {
        this.authorFlairType = authorFlairType;
    }

    public String getAuthorFullname() {
        return authorFullname;
    }

    public void setAuthorFullname(String authorFullname) {
        this.authorFullname = authorFullname;
    }

    public Boolean getAuthorPatreonFlair() {
        return authorPatreonFlair;
    }

    public void setAuthorPatreonFlair(Boolean authorPatreonFlair) {
        this.authorPatreonFlair = authorPatreonFlair;
    }

    public Boolean getAuthorPremium() {
        return authorPremium;
    }

    public void setAuthorPremium(Boolean authorPremium) {
        this.authorPremium = authorPremium;
    }

    public List<Object> getAwarders() {
        return awarders;
    }

    public void setAwarders(List<Object> awarders) {
        this.awarders = awarders;
    }

    public Boolean getCanModPost() {
        return canModPost;
    }

    public void setCanModPost(Boolean canModPost) {
        this.canModPost = canModPost;
    }

    public Boolean getContestMode() {
        return contestMode;
    }

    public void setContestMode(Boolean contestMode) {
        this.contestMode = contestMode;
    }

    public Integer getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Integer createdUtc) {
        this.createdUtc = createdUtc;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getFullLink() {
        return fullLink;
    }

    public void setFullLink(String fullLink) {
        this.fullLink = fullLink;
    }

    public Gildings getGildings() {
        return gildings;
    }

    public void setGildings(Gildings gildings) {
        this.gildings = gildings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsCrosspostable() {
        return isCrosspostable;
    }

    public void setIsCrosspostable(Boolean isCrosspostable) {
        this.isCrosspostable = isCrosspostable;
    }

    public Boolean getIsMeta() {
        return isMeta;
    }

    public void setIsMeta(Boolean isMeta) {
        this.isMeta = isMeta;
    }

    public Boolean getIsOriginalContent() {
        return isOriginalContent;
    }

    public void setIsOriginalContent(Boolean isOriginalContent) {
        this.isOriginalContent = isOriginalContent;
    }

    public Boolean getIsRedditMediaDomain() {
        return isRedditMediaDomain;
    }

    public void setIsRedditMediaDomain(Boolean isRedditMediaDomain) {
        this.isRedditMediaDomain = isRedditMediaDomain;
    }

    public Boolean getIsRobotIndexable() {
        return isRobotIndexable;
    }

    public void setIsRobotIndexable(Boolean isRobotIndexable) {
        this.isRobotIndexable = isRobotIndexable;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getLinkFlairBackgroundColor() {
        return linkFlairBackgroundColor;
    }

    public void setLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
        this.linkFlairBackgroundColor = linkFlairBackgroundColor;
    }

    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public List<LinkFlairRichtext> getLinkFlairRichtext() {
        return linkFlairRichtext;
    }

    public void setLinkFlairRichtext(List<LinkFlairRichtext> linkFlairRichtext) {
        this.linkFlairRichtext = linkFlairRichtext;
    }

    public String getLinkFlairTemplateId() {
        return linkFlairTemplateId;
    }

    public void setLinkFlairTemplateId(String linkFlairTemplateId) {
        this.linkFlairTemplateId = linkFlairTemplateId;
    }

    public String getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public String getLinkFlairTextColor() {
        return linkFlairTextColor;
    }

    public void setLinkFlairTextColor(String linkFlairTextColor) {
        this.linkFlairTextColor = linkFlairTextColor;
    }

    public String getLinkFlairType() {
        return linkFlairType;
    }

    public void setLinkFlairType(String linkFlairType) {
        this.linkFlairType = linkFlairType;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public MediaEmbed getMediaEmbed() {
        return mediaEmbed;
    }

    public void setMediaEmbed(MediaEmbed mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    public Boolean getMediaOnly() {
        return mediaOnly;
    }

    public void setMediaOnly(Boolean mediaOnly) {
        this.mediaOnly = mediaOnly;
    }

    public Boolean getNoFollow() {
        return noFollow;
    }

    public void setNoFollow(Boolean noFollow) {
        this.noFollow = noFollow;
    }

    public Integer getNumComments() {
        return numComments;
    }

    public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

    public Integer getNumCrossposts() {
        return numCrossposts;
    }

    public void setNumCrossposts(Integer numCrossposts) {
        this.numCrossposts = numCrossposts;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public Integer getPwls() {
        return pwls;
    }

    public void setPwls(Integer pwls) {
        this.pwls = pwls;
    }

    public String getRemovedByCategory() {
        return removedByCategory;
    }

    public void setRemovedByCategory(String removedByCategory) {
        this.removedByCategory = removedByCategory;
    }

    public Integer getRetrievedOn() {
        return retrievedOn;
    }

    public void setRetrievedOn(Integer retrievedOn) {
        this.retrievedOn = retrievedOn;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public SecureMedia getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(SecureMedia secureMedia) {
        this.secureMedia = secureMedia;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public Boolean getSendReplies() {
        return sendReplies;
    }

    public void setSendReplies(Boolean sendReplies) {
        this.sendReplies = sendReplies;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    public Boolean getStickied() {
        return stickied;
    }

    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public Integer getSubredditSubscribers() {
        return subredditSubscribers;
    }

    public void setSubredditSubscribers(Integer subredditSubscribers) {
        this.subredditSubscribers = subredditSubscribers;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public String getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(String suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalAwardsReceived() {
        return totalAwardsReceived;
    }

    public void setTotalAwardsReceived(Integer totalAwardsReceived) {
        this.totalAwardsReceived = totalAwardsReceived;
    }

    public List<Object> getTreatmentTags() {
        return treatmentTags;
    }

    public void setTreatmentTags(List<Object> treatmentTags) {
        this.treatmentTags = treatmentTags;
    }

    public Double getUpvoteRatio() {
        return upvoteRatio;
    }

    public void setUpvoteRatio(Double upvoteRatio) {
        this.upvoteRatio = upvoteRatio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlOverriddenByDest() {
        return urlOverriddenByDest;
    }

    public void setUrlOverriddenByDest(String urlOverriddenByDest) {
        this.urlOverriddenByDest = urlOverriddenByDest;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public Integer getWls() {
        return wls;
    }

    public void setWls(Integer wls) {
        this.wls = wls;
    }

}
