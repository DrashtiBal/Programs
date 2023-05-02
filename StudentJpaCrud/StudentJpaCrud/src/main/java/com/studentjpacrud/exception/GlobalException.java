package com.studentjpacrud.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException extends RuntimeException
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ApiResponse resourceNotFoundHandler(ResourceNotFoundException exception)
	{
		
		String msg =exception.getMessage();
		LocalDateTime now=LocalDateTime.now();
		ApiResponse api=new ApiResponse(msg,now);
		return api;
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> methodArgInvalid(MethodArgumentNotValidException exceptionMethodArg)
	{
	Map<String,String> map=new HashMap<>();
	exceptionMethodArg.getBindingResult().getFieldErrors().forEach(error->{
		
		map.put(error.getField(), error.getDefaultMessage());
	});
	
	return map;
	}
	
}
