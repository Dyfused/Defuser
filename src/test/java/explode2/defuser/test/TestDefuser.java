package explode2.defuser.test;

import explode2.defuser.Defuser;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@SuppressWarnings("SpellCheckingInspection")
public class TestDefuser {

	public static Defuser defuser = new Retrofit.Builder()
			.baseUrl("http://43.142.173.63:10483/bomb/v2/")
			.addConverterFactory(GsonConverterFactory.create())
			.build()
			.create(Defuser.class);

	@Test
	@Ignore
	public void testDefuser() throws IOException {
		var queryUser =
				defuser.getUser("3400cba2-cd86-43d3-ace4-0da1a92481c9").execute().body();
		System.out.println(queryUser);

		var querySet =
				defuser.getSet("cll509xx1qiuedev2ceozhf3").execute().body();
		System.out.println(querySet);

		var queryChart =
				defuser.getChart("ueo6rxfi32c8ofuydgtvfzn3").execute().body();
		System.out.println(queryChart);

		var queryUserBest =
				defuser.getUserBestRecords("3400cba2-cd86-43d3-ace4-0da1a92481c9", 500).execute().body();
		System.out.println(queryUserBest);

		var queryUserLast =
				defuser.getUserLastRecords("3400cba2-cd86-43d3-ace4-0da1a92481c9", 500).execute().body();
		System.out.println(queryUserLast);
	}

}
