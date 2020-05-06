package main;

import dao.ProductDAO;
import vo.ProductVO;

public class insertProduct {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductVO vo = new ProductVO();

		
//		 vo.setPname("LADY DIOR 송아지 가죽 백.red"); 
//		 vo.setPrice(6500000);
//		 vo.setDcratio(10); 
//		 vo.setProdesc("체리 레드 컬러 까나쥬 페이턴트 송아지 가죽 “Lady Dior” 백으로, 실버 컬러 메탈 주얼리 장식이 특징.");
//		 vo.setQty(5); 
//		 vo.setImgfile("../images/dior_red.jpg");
//		 vo.setBigfile("../images/dior_red.jpg");
		 
		 
		  
//			  vo.setPname("LADY DIOR 악어 가죽 백.black"); 
//			  vo.setPrice(5500000);
//			  vo.setDcratio(5); 
//			  vo.setProdesc("화이트데이를 위한 선물"); 
//			  vo.setQty(20);
//			  vo.setImgfile("../images/dior_black.jpg");
//			  vo.setBigfile("../images/dior_black.jpg");
		 
		 vo.setPname("YSL");
		 vo.setPrice(2000000);
		 vo.setDcratio(5);
		 vo.setProdesc("고급스러운 장식의 입생로랑 백");
		 vo.setQty(3);
		 vo.setImgfile("../images/saint.jpg");
		 vo.setBigfile("../images/saint.jpg");
			 

		int result = dao.addData(vo);
		System.out.println(result);

	}
}
