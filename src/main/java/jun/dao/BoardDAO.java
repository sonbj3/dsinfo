package jun.dao;

import java.util.List;

import jun.vo.BoardBean;


public class BoardDAO {

	public List<BoardBean> selectJunList(BoardBean boardBean)throws Exception {
		return (List<BoardBean>) list("junList", boardBean);
	}

//	public static List<BoardBean> junList(BoardBean boardBean) {
//		return (List<BoardBean>) junBoardList("junBoardList",boardBean);
//	}
	
//	public static List<BoardBean> getBoardList() {
//		return (List<BoardBean>) list("list");
//	}
//	(List<BoardMasterVO>) list("BBSAttributeManageDAO.selectBBSMasterInfs", vo);

}
