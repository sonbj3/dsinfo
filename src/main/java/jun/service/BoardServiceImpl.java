package jun.service;

import java.util.List;

import egovframework.let.cop.bbs.service.BoardMasterVO;
import jun.dao.BoardDAO;
import jun.vo.BoardBean;

public class BoardServiceImpl implements BoardService {

	@Override
	public List<BoardBean> selectJunList(BoardBean boardBean) {

		return BoardDAO.selectJunList(boardBean);
	}

	
	
//	@Override
//	public List<BoardBean> getBoardList() {
//
//		return BoardDAO.getBoardList();
//	}
//	 public List<BoardMasterVO> selectAllBBSMasteInf(BoardMasterVO vo) throws Exception {
//			return attrbMngDAO.selectAllBBSMasteInf(vo);
//		    }

}
