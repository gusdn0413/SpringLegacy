package com.nc13.spring_legacy.service;

import com.nc13.spring_legacy.model.BoardDTO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    private final SqlSession session;
    private final String NAMESPACE = "mappers.BoardMapper.";

    public List<BoardDTO> selectAll() {
        return session.selectList(NAMESPACE + "selectAll");
    }

}
