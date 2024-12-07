package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIServiceImpl implements APIService
{
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Object> viewallcomments() 
	{
	  Object[] c = restTemplate.getForObject("http://localhost:2031/student/viewall", Object[].class);
	  return Arrays.asList(c);
	}


	

	

}
