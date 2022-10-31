package explode2.defuser.entity;

import lombok.Data;

@Data
public class DyResponse<T> {

	public boolean success;
	public T data;

}