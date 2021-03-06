package common.data;
import lombok.Data;

@Data
public class ResultData<T> {
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	/** 结果状态 ,正常响应200，其他状态码都为失败*/
    private int status;
    private String message;
    private T data;
    private boolean success;
    
    /**
     *@{author} jifeng
     *@{date} 2020年4月22日
     *@{tags} @param t
     *@{tags} 调用成功
     */
    public static <T> ResultData<T>  success(T t){
    	ResultData<T> data = new ResultData<T>();
    	data.setSuccess(true);
    	data.setStatus(200);
    	data.setData(t);
    	data.setMessage("调用成功");
    	return data;
    }
    
    /**
     *@{author} jifeng
     *@{date} 2020年4月22日
     *@{tags} @param t
     *@{tags} 调用成功
     */
    public static <T> ResultData<T>  fail(T t){
    	ResultData<T> data = new ResultData<T>();
    	data.setSuccess(false);
    	data.setStatus(500);
    	data.setData(t);
    	data.setMessage("调用失败");
    	return data;
    }
}
