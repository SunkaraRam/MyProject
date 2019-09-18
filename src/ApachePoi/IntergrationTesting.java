package ApachePoi;

import java.io.IOException;

public class IntergrationTesting extends XLutils{

	public static void main(String[] args) throws IOException {
		
		String xlfile = "D:\\MyProject\\DataFolder\\Sample.xlsx";
		
		String	xlsheet = "LoginData";
		
		XLutils xl = new XLutils();
		
		
		int rnum = xl.getRowCount(xlfile,xlsheet );
		
		System.out.println(rnum);
		
		
		int cnum = xl.getcolCount(xlfile, xlsheet, 1);
	
		System.out.println(rnum);
		
		xl.setCellData(xlfile, xlsheet, 4, 6, "VidyaSree");
	
		String name = xl.getCelldata(xlfile, xlsheet, 4, 6);
		
		System.out.println(name);
		
		xl.fillGreenColor(xlfile, xlsheet, 4, 6);
		
		xl.fillRedColor(xlfile, xlsheet, 4, 7);
		
		//xl.fillGreenColor(xlfile, xlsheet, 4, 8);
		
	}

}
