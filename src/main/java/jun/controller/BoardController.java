package jun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jun.service.BoardService;
import jun.vo.BoardBean;

@Controller
public class BoardController {
//	
	@Resource(name = "boardService")
	private BoardService boardService;

	@RequestMapping(value = "/board/junList.do")
	public String junList(BoardBean boardBean, ModelMap model) throws Exception{
	
		List<BoardBean> list = boardService.junList(boardBean);
		model.addAttribute("list", list);
		return "/board/list";
		
	}
	
//	@RequestMapping(value = "/board/junBoardList.do")
//	public String list(@ModelAttribute("boardBean") BoardBean boardBean, HttpServletRequest request, ModelMap model) throws Exception {
//		System.out.println("list");
//		
//	      List<BoardBean> boardList = BoardService.getBoardList();
//
//          model.addAttribute("boardList",boardList);
//          
//		return "/board/list";
//	}
}
