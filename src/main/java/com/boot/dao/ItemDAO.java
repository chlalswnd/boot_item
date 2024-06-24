package com.boot.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.ItemDTO;

@Mapper
public interface ItemDAO {
	public void write(HashMap<String, String> param);
	public ArrayList<ItemDTO> list();
}
