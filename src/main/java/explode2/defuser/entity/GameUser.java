package explode2.defuser.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class GameUser {

	public String id;
	public String username;

	public int coin;
	public int diamond;

	public String pptime;

	public boolean reviewer;

	@SerializedName("bought_sets")
	public List<String> boughtSets;

}
