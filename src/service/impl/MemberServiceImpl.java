package service.impl;

import hib.Member;

import service.MemberService;
import service.IMemberDAO;

public class MemberServiceImpl implements MemberService {

	public IMemberDAO memberDAO;
	public IMemberDAO getMemberDAO(){return memberDAO;}
	public void setMemberDAO(IMemberDAO memberDAO){this.memberDAO=memberDAO;}

	public void addmember() {
		// TODO Auto-generated method stub
		Member e = new Member();
		memberDAO.save(e);
		
	}

}
