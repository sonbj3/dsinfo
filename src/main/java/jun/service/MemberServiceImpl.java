package jun.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.com.cmm.LoginVO;
import egovframework.let.uat.uia.service.impl.LoginDAO;
import egovframework.let.utl.sim.service.EgovFileScrty;
import jun.dao.MemberDAO;
import jun.vo.MemberBean;


@Service("service")
public class MemberServiceImpl implements MemberService {

//	@Autowired
//	MemberDAO dao;

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;
	
	
	@Override
	public void selectUserInfo(HashMap<String, String> map) {
		memberDAO.selectUserInfo(map);
	}

	@Override
	public MemberBean userCheck(MemberBean mb){
		System.out.println("service userCheck");
		
		return memberDAO.userCheck(mb);
	}

	@Override 
	public void insert(MemberBean mb) {
		System.out.println("service insert");
		memberDAO.insert(mb);
	}

	@Override
	public MemberBean actionLogin(MemberBean mb) throws Exception{
		
		System.out.println("서비스");
		
		MemberBean memberInfo = memberDAO.actionLogin(mb);
		
		if (memberInfo != null) {
			System.out.println("1");
		
		} else {
			System.out.println("2");
			memberInfo = new MemberBean();
		}
		
		return memberInfo;
	}


}
