package kr.ac.kopo.konumon.bookmarket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//카테고리를 찾을 수 없을 때 처리하기 위한 사용자 정의 예외클래스
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CategoryException extends RuntimeException {
    private String errorMessage;
    private String category;
    public CategoryException() {
        super();
        this.category = category;
        errorMessage = "";
        System.out.println(errorMessage);
    }
}