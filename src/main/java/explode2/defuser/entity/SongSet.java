package explode2.defuser.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Data
public class SongSet {

	public String id;

	@SerializedName("music_name")
	public String musicName;
	@SerializedName("music_composer")
	public String musicComposer;

	public String introduction;

	@SerializedName("coin_price")
	public int coinPrice;

	@SerializedName("noter_name")
	public String noterName;

	@Nullable
	@SerializedName("noter_user_id")
	public String noterUserId;

	@SerializedName("child_charts")
	public List<String> childCharts;

	@SerializedName("play_count")
	public int playCount;

	@SerializedName("publish_time")
	public String publishTime;

	public int category;
	public boolean hidden;
	public boolean reviewing;

	public boolean isRanked() {
		return category == 1 || category == 2;
	}

	public boolean isOfficial() {
		return category == 2;
	}

}
