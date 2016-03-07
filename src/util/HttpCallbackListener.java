package util;

public interface HttpCallbackListener {
	void onFinish(String resPonse);

	void onError(Exception e);

}
