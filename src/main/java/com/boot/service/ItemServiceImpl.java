package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ItemDAO;
import com.boot.dto.ItemDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("ItemService")
public class ItemServiceImpl implements ItemService{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# ItemServiceImpl write");
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		
		dao.write(param);
	}

	@Override
	public ArrayList<ItemDTO> list() {
		log.info("@# ItemServiceImpl list");
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		ArrayList<ItemDTO> list = dao.list();
		
		return list;
	}

}
