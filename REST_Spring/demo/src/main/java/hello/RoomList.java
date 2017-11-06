package hello;

public class RoomList {
	private final long id;
	private final String title;
	private final String thumbnailUrl;

	public RoomList(long id, String title, String thumbnailUrl) {
		this.id = id;
		this.title = title;
		this.thumbnailUrl = thumbnailUrl;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
}
