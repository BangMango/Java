package pandoraGround;

import pandoraBox.PandoraBoxMain;
import pandoraBox02.PandoraBox02Main;
import pandoraBox03.PandoraBox03Main;

public class CatMountain {

	public static void main(String[] args) {
		PandoraBoxMain p=new PandoraBoxMain();
		PandoraBox02Main p2=new PandoraBox02Main();
		PandoraBox03Main p3=new PandoraBox03Main();
		p2.SetPandoraMain("silver");
		p3.SetPandoraMain("Bronze");
		System.out.println(p2.getPamdoraMain());
		System.out.println(p3.getPamdoraMain());

	}

}
