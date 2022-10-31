package explode2.defuser.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.jetbrains.annotations.Nullable;

@Data
public class SongChart {

	public String id;

	@SerializedName("difficulty_class")
	public int difficultyClass;
	@SerializedName("difficulty_value")
	public int difficultyValue;

	@Nullable
	public Double d;

	@SerializedName("parent_set_id")
	public String parentSetId;

}
