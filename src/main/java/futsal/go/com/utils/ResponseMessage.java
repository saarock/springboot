package futsal.go.com.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class ResponseMessage<T> {
    private String type;
    private String message;
    private int status;
    private T data;

    public ResponseMessage(String type, String message, int status, T data) {
        this.type = type;
        this.message = message;
        this.status = status;
        this.data = data;
    }
    
}
