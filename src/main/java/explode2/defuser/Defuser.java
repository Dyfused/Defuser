package explode2.defuser;

import explode2.defuser.entity.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface Defuser {

	@GET("user/{id}")
	Call<DyResponse<GameUser>> getUser(@Path("id") String id);

	@GET("set/{id}")
	Call<DyResponse<SongSet>> getSet(@Path("id") String id);

	@GET("chart/{id}")
	Call<DyResponse<SongChart>> getChart(@Path("id") String id);

	@GET("user/{id}/best")
	Call<DyResponse<List<GameRecord>>> getUserBestRecords(@Path("id") String id, @Query("limit") int limit);

	@GET("user/{id}/last")
	Call<DyResponse<List<GameRecord>>> getUserLastRecords(@Path("id") String id, @Query("limit") int limit);
}
