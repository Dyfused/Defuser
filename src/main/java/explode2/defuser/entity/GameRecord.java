package explode2.defuser.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GameRecord {

	public String id;

	@SerializedName("player_id")
	public String playerId;

	@SerializedName("set_id")
	public String setId;
	@SerializedName("chart_id")
	public String chartId;

	public int perfect;
	public int good;
	public int miss;

	public int score;

	@SerializedName("upload_time")
	public String uploadTime;

	public int r;

	@SerializedName("set_info")
	public SongSet setInfo;
	@SerializedName("chart_info")
	public SongChart chartInfo;

}
