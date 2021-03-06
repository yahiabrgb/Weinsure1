package tn.weinsure1;


import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.weinsure1.entities.Contract;
import tn.weinsure1.entities.TableMortalit√©;
import tn.weinsure1.entities.User;
import tn.weinsure1.entities.sinister;
import tn.weinsure1.entities.sinisterstatus;
import tn.weinsure1.entities.typeSinister;
import tn.weinsure1.service.ITableMortaliteService;
import tn.weinsure1.service.IsinisterService;
import tn.weinsure1.service.sinisterServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaMvcJspApplicationTest {
	@Autowired 
	IsinisterService is; 
   @Autowired 
   ITableMortaliteService tr; 
   private static final Logger L = LogManager.getLogger(sinisterServiceImpl.class);
 /*
=======
/*
>>>>>>> branch 'master' of https://github.com/yahiabrgb/Weinsure1.git
	@Test
	public void testRetrieveAllUsers() {
		List<sinister> sinistres = is.retrieveAllSinistres() ;
		//Assert.assertEquals(1, sinistres.size()); }
<<<<<<< HEAD
	}
	
	
	@Test
=======
	}*/
   /*s
	@Tests
>>>>>>> branch 'master' of https://github.com/yahiabrgb/Weinsure1.git
	public void testAddSinistre() throws ParseException    {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Date d = dateFormat.parse("2018-02-02");
		sinister s = new sinister (typeSinister.vie, "My first sinistre",d,sinisterstatus.encours , null );
		sinister sinistreAdded = is.addSinistre(s);
		Assert.assertEquals(s.getIdSinistre(), sinistreAdded.getIdSinistre());

	} 
/*

	@Test
	public void testUpdateSinistre() throws ParseException    {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Date d = dateFormat.parse("2018-02-02");
		sinister s = new sinister (2L, typeSinister.vie, "My first sinistre MODIFIED AGAIN",d, sinisterstatus.encours, null );
		sinister sinistreUpdated = is.updateSinistre(s);
		Assert.assertEquals(s.getDescription(), sinistreUpdated.getDescription());

	} 


	@Test
	public void testRetrieveSinistre() {
		sinister sinistre = is.retrieveSinistre("5"); 
		//Assert.assertEquals(5L,sinistre.getIdSinistre().longValue());
	} 

	@Test
	public void testDeleteSinistre() {

		is.deleteSinistre("1");
	}
	@Test
	public void testfindByDescription() {

		List<sinister> sinistres = is.findByDescription("my") ;

	} 

	@Test
	public void testfindByYear() {

		List<sinister> sinistres = is.findByYear("2018") ;

	} 

	@Test
	public void testfindByAny() {

		List<sinister> sinistres = is.findByAny("2018") ;

	} 
	 @Test
	public void testSendMail() {
		is.SendMail();
	}
	/* @Test		//Add tm
		public void TestAddtm() throws ParseException    {
			TableMortalit√© t0=new TableMortalit√©(0,100000,100000);	TableMortalit√© tm0=tr.Addtm(t0);	Assert.assertEquals(t0.getIdTable(),tm0.getIdTable());
			TableMortalit√© t1=new TableMortalit√©(1,97104,97660);	TableMortalit√© tm1=tr.Addtm(t1);	Assert.assertEquals(t1.getIdTable(),tm1.getIdTable());
			TableMortalit√© t2=new TableMortalit√©(2,96869,97436);	TableMortalit√© tm2=tr.Addtm(t2);	Assert.assertEquals(t2.getIdTable(),tm2.getIdTable());
			TableMortalit√© t3=new TableMortalit√©(3,96727,97311);	TableMortalit√© tm3=tr.Addtm(t3);	Assert.assertEquals(t3.getIdTable(),tm3.getIdTable());
			TableMortalit√© t4=new TableMortalit√©(4,96624,97223);	TableMortalit√© tm4=tr.Addtm(t4);	Assert.assertEquals(t4.getIdTable(),tm4.getIdTable());
			TableMortalit√© t5=new TableMortalit√©(5,96541,97156);	TableMortalit√© tm5=tr.Addtm(t5);	Assert.assertEquals(t5.getIdTable(),tm5.getIdTable());
			TableMortalit√© t6=new TableMortalit√©(6,96471,97100);	TableMortalit√© tm6=tr.Addtm(t6);	Assert.assertEquals(t6.getIdTable(),tm6.getIdTable());
			TableMortalit√© t7=new TableMortalit√©(7,96410,97051);	TableMortalit√© tm7=tr.Addtm(t7);	Assert.assertEquals(t7.getIdTable(),tm7.getIdTable());
			TableMortalit√© t8=new TableMortalit√©(8,96356,97006);	TableMortalit√© tm8=tr.Addtm(t8);	Assert.assertEquals(t8.getIdTable(),tm8.getIdTable());
			TableMortalit√© t9=new TableMortalit√©(9,96306,96964);	TableMortalit√© tm9=tr.Addtm(t9);	Assert.assertEquals(t9.getIdTable(),tm9.getIdTable());
			TableMortalit√© t10=new TableMortalit√©(10,96258,96923);	TableMortalit√© tm10=tr.Addtm(t10);	Assert.assertEquals(t10.getIdTable(),tm10.getIdTable());
			TableMortalit√© t11=new TableMortalit√©(11,96211,96883);	TableMortalit√© tm11=tr.Addtm(t11);	Assert.assertEquals(t11.getIdTable(),tm11.getIdTable());
			TableMortalit√© t12=new TableMortalit√©(12,96163,96842);	TableMortalit√© tm12=tr.Addtm(t12);	Assert.assertEquals(t12.getIdTable(),tm12.getIdTable());
			TableMortalit√© t13=new TableMortalit√©(13,96111,96800);	TableMortalit√© tm13=tr.Addtm(t13);	Assert.assertEquals(t13.getIdTable(),tm13.getIdTable());
			TableMortalit√© t14=new TableMortalit√©(14,96052,96758);	TableMortalit√© tm14=tr.Addtm(t14);	Assert.assertEquals(t14.getIdTable(),tm14.getIdTable());
			TableMortalit√© t15=new TableMortalit√©(15,95985,96713);	TableMortalit√© tm15=tr.Addtm(t15);	Assert.assertEquals(t15.getIdTable(),tm15.getIdTable());
			TableMortalit√© t16=new TableMortalit√©(16,95908,96667);	TableMortalit√© tm16=tr.Addtm(t16);	Assert.assertEquals(t16.getIdTable(),tm16.getIdTable());
			TableMortalit√© t17=new TableMortalit√©(17,95821,96619);	TableMortalit√© tm17=tr.Addtm(t17);	Assert.assertEquals(t17.getIdTable(),tm17.getIdTable());
			TableMortalit√© t18=new TableMortalit√©(18,95722,96569);	TableMortalit√© tm18=tr.Addtm(t18);	Assert.assertEquals(t18.getIdTable(),tm18.getIdTable());
			TableMortalit√© t19=new TableMortalit√©(19,95614,96517);	TableMortalit√© tm19=tr.Addtm(t19);	Assert.assertEquals(t19.getIdTable(),tm19.getIdTable());
			TableMortalit√© t20=new TableMortalit√©(20,95496,96462);	TableMortalit√© tm20=tr.Addtm(t20);	Assert.assertEquals(t20.getIdTable(),tm20.getIdTable());
			TableMortalit√© t21=new TableMortalit√©(21,95372,96405);	TableMortalit√© tm21=tr.Addtm(t21);	Assert.assertEquals(t21.getIdTable(),tm21.getIdTable());
			TableMortalit√© t22=new TableMortalit√©(22,95242,96346);	TableMortalit√© tm22=tr.Addtm(t22);	Assert.assertEquals(t22.getIdTable(),tm22.getIdTable());
			TableMortalit√© t23=new TableMortalit√©(23,95108,96284);	TableMortalit√© tm23=tr.Addtm(t23);	Assert.assertEquals(t23.getIdTable(),tm23.getIdTable());
			TableMortalit√© t24=new TableMortalit√©(24,94971,96219);	TableMortalit√© tm24=tr.Addtm(t24);	Assert.assertEquals(t24.getIdTable(),tm24.getIdTable());
			TableMortalit√© t25=new TableMortalit√©(25,94834,96151);	TableMortalit√© tm25=tr.Addtm(t25);	Assert.assertEquals(t25.getIdTable(),tm25.getIdTable());
			TableMortalit√© t26=new TableMortalit√©(26,94696,96080);	TableMortalit√© tm26=tr.Addtm(t26);	Assert.assertEquals(t26.getIdTable(),tm26.getIdTable());
			TableMortalit√© t27=new TableMortalit√©(27,94558,96006);	TableMortalit√© tm27=tr.Addtm(t27);	Assert.assertEquals(t27.getIdTable(),tm27.getIdTable());
			TableMortalit√© t28=new TableMortalit√©(28,94420,95929);	TableMortalit√© tm28=tr.Addtm(t28);	Assert.assertEquals(t28.getIdTable(),tm28.getIdTable());
			TableMortalit√© t29=new TableMortalit√©(29,94283,95849);	TableMortalit√© tm29=tr.Addtm(t29);	Assert.assertEquals(t29.getIdTable(),tm29.getIdTable());
			TableMortalit√© t30=new TableMortalit√©(30,94145,95765);	TableMortalit√© tm30=tr.Addtm(t30);	Assert.assertEquals(t30.getIdTable(),tm30.getIdTable());
			TableMortalit√© t31=new TableMortalit√©(31,94007,95677);	TableMortalit√© tm31=tr.Addtm(t31);	Assert.assertEquals(t31.getIdTable(),tm31.getIdTable());
			TableMortalit√© t32=new TableMortalit√©(32,93867,95585);	TableMortalit√© tm32=tr.Addtm(t32);	Assert.assertEquals(t32.getIdTable(),tm32.getIdTable());
			TableMortalit√© t33=new TableMortalit√©(33,93724,95488);	TableMortalit√© tm33=tr.Addtm(t33);	Assert.assertEquals(t33.getIdTable(),tm33.getIdTable());
			TableMortalit√© t34=new TableMortalit√©(34,93578,95387);	TableMortalit√© tm34=tr.Addtm(t34);	Assert.assertEquals(t34.getIdTable(),tm34.getIdTable());
			TableMortalit√© t35=new TableMortalit√©(35,93426,95281);	TableMortalit√© tm35=tr.Addtm(t35);	Assert.assertEquals(t35.getIdTable(),tm35.getIdTable());
			TableMortalit√© t36=new TableMortalit√©(36,93268,95170);	TableMortalit√© tm36=tr.Addtm(t36);	Assert.assertEquals(t36.getIdTable(),tm36.getIdTable());
			TableMortalit√© t37=new TableMortalit√©(37,93102,95052);	TableMortalit√© tm37=tr.Addtm(t37);	Assert.assertEquals(t37.getIdTable(),tm37.getIdTable());
			TableMortalit√© t38=new TableMortalit√©(38,92926,94928);	TableMortalit√© tm38=tr.Addtm(t38);	Assert.assertEquals(t38.getIdTable(),tm38.getIdTable());
			TableMortalit√© t39=new TableMortalit√©(39,92739,94796);	TableMortalit√© tm39=tr.Addtm(t39);	Assert.assertEquals(t39.getIdTable(),tm39.getIdTable());
			TableMortalit√© t40=new TableMortalit√©(40,92538,94656);	TableMortalit√© tm40=tr.Addtm(t40);	Assert.assertEquals(t40.getIdTable(),tm40.getIdTable());
			TableMortalit√© t41=new TableMortalit√©(41,92323,94508);	TableMortalit√© tm41=tr.Addtm(t41);	Assert.assertEquals(t41.getIdTable(),tm41.getIdTable());
			TableMortalit√© t42=new TableMortalit√©(42,92089,94350);	TableMortalit√© tm42=tr.Addtm(t42);	Assert.assertEquals(t42.getIdTable(),tm42.getIdTable());
			TableMortalit√© t43=new TableMortalit√©(43,91837,94180);	TableMortalit√© tm43=tr.Addtm(t43);	Assert.assertEquals(t43.getIdTable(),tm43.getIdTable());
			TableMortalit√© t44=new TableMortalit√©(44,91562,93999);	TableMortalit√© tm44=tr.Addtm(t44);	Assert.assertEquals(t44.getIdTable(),tm44.getIdTable());
			TableMortalit√© t45=new TableMortalit√©(45,91263,93804);	TableMortalit√© tm45=tr.Addtm(t45);	Assert.assertEquals(t45.getIdTable(),tm45.getIdTable());
			TableMortalit√© t46=new TableMortalit√©(46,90937,93594);	TableMortalit√© tm46=tr.Addtm(t46);	Assert.assertEquals(t46.getIdTable(),tm46.getIdTable());
			TableMortalit√© t47=new TableMortalit√©(47,90580,93367);	TableMortalit√© tm47=tr.Addtm(t47);	Assert.assertEquals(t47.getIdTable(),tm47.getIdTable());
			TableMortalit√© t48=new TableMortalit√©(48,90190,93121);	TableMortalit√© tm48=tr.Addtm(t48);	Assert.assertEquals(t48.getIdTable(),tm48.getIdTable());
			TableMortalit√© t49=new TableMortalit√©(49,89764,92854);	TableMortalit√© tm49=tr.Addtm(t49);	Assert.assertEquals(t49.getIdTable(),tm49.getIdTable());
			TableMortalit√© t50=new TableMortalit√©(50,89297,92564);	TableMortalit√© tm50=tr.Addtm(t50);	Assert.assertEquals(t50.getIdTable(),tm50.getIdTable());
			TableMortalit√© t51=new TableMortalit√©(51,88786,92247);	TableMortalit√© tm51=tr.Addtm(t51);	Assert.assertEquals(t51.getIdTable(),tm51.getIdTable());
			TableMortalit√© t52=new TableMortalit√©(52,88226,91901);	TableMortalit√© tm52=tr.Addtm(t52);	Assert.assertEquals(t52.getIdTable(),tm52.getIdTable());
			TableMortalit√© t53=new TableMortalit√©(53,87614,91523);	TableMortalit√© tm53=tr.Addtm(t53);	Assert.assertEquals(t53.getIdTable(),tm53.getIdTable());
			TableMortalit√© t54=new TableMortalit√©(54,86944,91108);	TableMortalit√© tm54=tr.Addtm(t54);	Assert.assertEquals(t54.getIdTable(),tm54.getIdTable());
			TableMortalit√© t55=new TableMortalit√©(55,86211,90651);	TableMortalit√© tm55=tr.Addtm(t55);	Assert.assertEquals(t55.getIdTable(),tm55.getIdTable());
			TableMortalit√© t56=new TableMortalit√©(56,85410,90150);	TableMortalit√© tm56=tr.Addtm(t56);	Assert.assertEquals(t56.getIdTable(),tm56.getIdTable());
			TableMortalit√© t57=new TableMortalit√©(57,84536,89597);	TableMortalit√© tm57=tr.Addtm(t57);	Assert.assertEquals(t57.getIdTable(),tm57.getIdTable());
			TableMortalit√© t58=new TableMortalit√©(58,83582,88988);	TableMortalit√© tm58=tr.Addtm(t58);	Assert.assertEquals(t58.getIdTable(),tm58.getIdTable());
			TableMortalit√© t59=new TableMortalit√©(59,82542,88317);	TableMortalit√© tm59=tr.Addtm(t59);	Assert.assertEquals(t59.getIdTable(),tm59.getIdTable());
			TableMortalit√© t60=new TableMortalit√©(60,81409,87576);	TableMortalit√© tm60=tr.Addtm(t60);	Assert.assertEquals(t60.getIdTable(),tm60.getIdTable());
			TableMortalit√© t61=new TableMortalit√©(61,80178,86757);	TableMortalit√© tm61=tr.Addtm(t61);	Assert.assertEquals(t61.getIdTable(),tm61.getIdTable());
			TableMortalit√© t62=new TableMortalit√©(62,78842,85853);	TableMortalit√© tm62=tr.Addtm(t62);	Assert.assertEquals(t62.getIdTable(),tm62.getIdTable());
			TableMortalit√© t63=new TableMortalit√©(63,77393,84856);	TableMortalit√© tm63=tr.Addtm(t63);	Assert.assertEquals(t63.getIdTable(),tm63.getIdTable());
			TableMortalit√© t64=new TableMortalit√©(64,75826,83754);	TableMortalit√© tm64=tr.Addtm(t64);	Assert.assertEquals(t64.getIdTable(),tm64.getIdTable());
			TableMortalit√© t65=new TableMortalit√©(65,74134,82540);	TableMortalit√© tm65=tr.Addtm(t65);	Assert.assertEquals(t65.getIdTable(),tm65.getIdTable());
			TableMortalit√© t66=new TableMortalit√©(66,72312,81202);	TableMortalit√© tm66=tr.Addtm(t66);	Assert.assertEquals(t66.getIdTable(),tm66.getIdTable());
			TableMortalit√© t67=new TableMortalit√©(67,70354,79729);	TableMortalit√© tm67=tr.Addtm(t67);	Assert.assertEquals(t67.getIdTable(),tm67.getIdTable());
			TableMortalit√© t68=new TableMortalit√©(68,68257,78111);	TableMortalit√© tm68=tr.Addtm(t68);	Assert.assertEquals(t68.getIdTable(),tm68.getIdTable());
			TableMortalit√© t69=new TableMortalit√©(69,66017,76337);	TableMortalit√© tm69=tr.Addtm(t69);	Assert.assertEquals(t69.getIdTable(),tm69.getIdTable());
			TableMortalit√© t70=new TableMortalit√©(70,63632,74395);	TableMortalit√© tm70=tr.Addtm(t70);	Assert.assertEquals(t70.getIdTable(),tm70.getIdTable());
			TableMortalit√© t71=new TableMortalit√©(71,61103,72275);	TableMortalit√© tm71=tr.Addtm(t71);	Assert.assertEquals(t71.getIdTable(),tm71.getIdTable());
			TableMortalit√© t72=new TableMortalit√©(72,58432,69969);	TableMortalit√© tm72=tr.Addtm(t72);	Assert.assertEquals(t72.getIdTable(),tm72.getIdTable());
			TableMortalit√© t73=new TableMortalit√©(73,55623,67469);	TableMortalit√© tm73=tr.Addtm(t73);	Assert.assertEquals(t73.getIdTable(),tm73.getIdTable());
			TableMortalit√© t74=new TableMortalit√©(74,52686,64770);	TableMortalit√© tm74=tr.Addtm(t74);	Assert.assertEquals(t74.getIdTable(),tm74.getIdTable());
			TableMortalit√© t75=new TableMortalit√©(75,49629,61869);	TableMortalit√© tm75=tr.Addtm(t75);	Assert.assertEquals(t75.getIdTable(),tm75.getIdTable());
			TableMortalit√© t76=new TableMortalit√©(76,46469,58769);	TableMortalit√© tm76=tr.Addtm(t76);	Assert.assertEquals(t76.getIdTable(),tm76.getIdTable());
			TableMortalit√© t77=new TableMortalit√©(77,43222,55474);	TableMortalit√© tm77=tr.Addtm(t77);	Assert.assertEquals(t77.getIdTable(),tm77.getIdTable());
			TableMortalit√© t78=new TableMortalit√©(78,39911,51997);	TableMortalit√© tm78=tr.Addtm(t78);	Assert.assertEquals(t78.getIdTable(),tm78.getIdTable());
			TableMortalit√© t79=new TableMortalit√©(79,36560,48356);	TableMortalit√© tm79=tr.Addtm(t79);	Assert.assertEquals(t79.getIdTable(),tm79.getIdTable());
			TableMortalit√© t80=new TableMortalit√©(80,33200,44576);	TableMortalit√© tm80=tr.Addtm(t80);	Assert.assertEquals(t80.getIdTable(),tm80.getIdTable());
			TableMortalit√© t81=new TableMortalit√©(81,29861,40689);	TableMortalit√© tm81=tr.Addtm(t81);	Assert.assertEquals(t81.getIdTable(),tm81.getIdTable());
			TableMortalit√© t82=new TableMortalit√©(82,26580,36735);	TableMortalit√© tm82=tr.Addtm(t82);	Assert.assertEquals(t82.getIdTable(),tm82.getIdTable());
			TableMortalit√© t83=new TableMortalit√©(83,23390,32762);	TableMortalit√© tm83=tr.Addtm(t83);	Assert.assertEquals(t83.getIdTable(),tm83.getIdTable());
			TableMortalit√© t84=new TableMortalit√©(84,20328,28823);	TableMortalit√© tm84=tr.Addtm(t84);	Assert.assertEquals(t84.getIdTable(),tm84.getIdTable());
			TableMortalit√© t85=new TableMortalit√©(85,17428,24976);	TableMortalit√© tm85=tr.Addtm(t85);	Assert.assertEquals(t85.getIdTable(),tm85.getIdTable());
			TableMortalit√© t86=new TableMortalit√©(86,14722,21282);	TableMortalit√© tm86=tr.Addtm(t86);	Assert.assertEquals(t86.getIdTable(),tm86.getIdTable());
			TableMortalit√© t87=new TableMortalit√©(87,12238,17799);	TableMortalit√© tm87=tr.Addtm(t87);	Assert.assertEquals(t87.getIdTable(),tm87.getIdTable());
			TableMortalit√© t88=new TableMortalit√©(88,9997,14583);	TableMortalit√© tm88=tr.Addtm(t88);	Assert.assertEquals(t88.getIdTable(),tm88.getIdTable());
			TableMortalit√© t89=new TableMortalit√©(89,8013,11679);	TableMortalit√© tm89=tr.Addtm(t89);	Assert.assertEquals(t89.getIdTable(),tm89.getIdTable());
			TableMortalit√© t90=new TableMortalit√©(90,6292,9122);	TableMortalit√© tm90=tr.Addtm(t90);	Assert.assertEquals(t90.getIdTable(),tm90.getIdTable());
			TableMortalit√© t91=new TableMortalit√©(91,4832,6931);	TableMortalit√© tm91=tr.Addtm(t91);	Assert.assertEquals(t91.getIdTable(),tm91.getIdTable());
			TableMortalit√© t92=new TableMortalit√©(92,3623,5110);	TableMortalit√© tm92=tr.Addtm(t92);	Assert.assertEquals(t92.getIdTable(),tm92.getIdTable());
			TableMortalit√© t93=new TableMortalit√©(93,2647,3645);	TableMortalit√© tm93=tr.Addtm(t93);	Assert.assertEquals(t93.getIdTable(),tm93.getIdTable());
			TableMortalit√© t94=new TableMortalit√©(94,1876,2498);	TableMortalit√© tm94=tr.Addtm(t94);	Assert.assertEquals(t94.getIdTable(),tm94.getIdTable());
			TableMortalit√© t95=new TableMortalit√©(95,1286,1637);	TableMortalit√© tm95=tr.Addtm(t95);	Assert.assertEquals(t95.getIdTable(),tm95.getIdTable());
			TableMortalit√© t96=new TableMortalit√©(96,850,1019);	TableMortalit√© tm96=tr.Addtm(t96);	Assert.assertEquals(t96.getIdTable(),tm96.getIdTable());
			TableMortalit√© t97=new TableMortalit√©(97,539,597);	TableMortalit√© tm97=tr.Addtm(t97);	Assert.assertEquals(t97.getIdTable(),tm97.getIdTable());
			TableMortalit√© t98=new TableMortalit√©(98,326,326);	TableMortalit√© tm98=tr.Addtm(t98);	Assert.assertEquals(t98.getIdTable(),tm98.getIdTable());
			TableMortalit√© t99=new TableMortalit√©(99,187,164);	TableMortalit√© tm99=tr.Addtm(t99);	Assert.assertEquals(t99.getIdTable(),tm99.getIdTable());
			TableMortalit√© t100=new TableMortalit√©(100,101,75);	TableMortalit√© tm100=tr.Addtm(t100);	Assert.assertEquals(t100.getIdTable(),tm100.getIdTable());
			TableMortalit√© t101=new TableMortalit√©(101,51,30);	TableMortalit√© tm101=tr.Addtm(t101);	Assert.assertEquals(t101.getIdTable(),tm101.getIdTable());
			TableMortalit√© t102=new TableMortalit√©(102,24,10);	TableMortalit√© tm102=tr.Addtm(t102);	Assert.assertEquals(t102.getIdTable(),tm102.getIdTable());
			TableMortalit√© t104=new TableMortalit√©(104,4,1);	TableMortalit√© tm104=tr.Addtm(t104);	Assert.assertEquals(t104.getIdTable(),tm104.getIdTable());
			TableMortalit√© t103=new TableMortalit√©(103,10,3);	TableMortalit√© tm103=tr.Addtm(t103);	Assert.assertEquals(t103.getIdTable(),tm103.getIdTable());
			TableMortalit√© t105=new TableMortalit√©(105,1,0);	TableMortalit√© tm105=tr.Addtm(t105);	Assert.assertEquals(t105.getIdTable(),tm105.getIdTable());
			TableMortalit√© t106=new TableMortalit√©(106,0,0);	TableMortalit√© tm106=tr.Addtm(t106);	Assert.assertEquals(t106.getIdTable(),tm106.getIdTable());
			TableMortalit√© t107=new TableMortalit√©(107,0,0);	TableMortalit√© tm107=tr.Addtm(t107);	Assert.assertEquals(t107.getIdTable(),tm107.getIdTable());
			TableMortalit√© t108=new TableMortalit√©(108,0,0);	TableMortalit√© tm108=tr.Addtm(t108);	Assert.assertEquals(t108.getIdTable(),tm108.getIdTable());
			TableMortalit√© t109=new TableMortalit√©(109,0,0);	TableMortalit√© tm109=tr.Addtm(t109);	Assert.assertEquals(t109.getIdTable(),tm109.getIdTable());
			TableMortalit√© t110=new TableMortalit√©(110,0,0);	TableMortalit√© tm110=tr.Addtm(t110);	Assert.assertEquals(t110.getIdTable(),tm110.getIdTable());
			TableMortalit√© t111=new TableMortalit√©(111,0,0);	TableMortalit√© tm111=tr.Addtm(t111);	Assert.assertEquals(t111.getIdTable(),tm111.getIdTable());
			TableMortalit√© t112=new TableMortalit√©(112,0,0);	TableMortalit√© tm112=tr.Addtm(t112);	Assert.assertEquals(t112.getIdTable(),tm112.getIdTable());
			TableMortalit√© t113=new TableMortalit√©(113,0,0);	TableMortalit√© tm113=tr.Addtm(t113);	Assert.assertEquals(t113.getIdTable(),tm113.getIdTable());
			TableMortalit√© t114=new TableMortalit√©(114,0,0);	TableMortalit√© tm114=tr.Addtm(t114);	Assert.assertEquals(t114.getIdTable(),tm114.getIdTable());
			TableMortalit√© t115=new TableMortalit√©(115,0,0);	TableMortalit√© tm115=tr.Addtm(t115);	Assert.assertEquals(t115.getIdTable(),tm115.getIdTable());
			TableMortalit√© t116=new TableMortalit√©(116,0,0);	TableMortalit√© tm116=tr.Addtm(t116);	Assert.assertEquals(t116.getIdTable(),tm116.getIdTable());
			TableMortalit√© t117=new TableMortalit√©(117,0,0);	TableMortalit√© tm117=tr.Addtm(t117);	Assert.assertEquals(t117.getIdTable(),tm117.getIdTable());
			TableMortalit√© t118=new TableMortalit√©(118,0,0);	TableMortalit√© tm118=tr.Addtm(t118);	Assert.assertEquals(t118.getIdTable(),tm118.getIdTable());
			TableMortalit√© t119=new TableMortalit√©(119,0,0);	TableMortalit√© tm119=tr.Addtm(t119);	Assert.assertEquals(t119.getIdTable(),tm119.getIdTable());

<<<<<<< HEAD
		}*/
	 /*
	 @Test
		public void testCalcul() {
			float som = tr.calcull(35000, 30, 36, 0.05);	
		}
		*/
   /*
	 @Test
		public void test333() {
		 List<sinister> sinistres = is.findbyuserid(10L);	
		}
		*/
   /*
	 @Test
		public void test33() {
		 int k = tr.findAgeMax();
		 L.info("description +++ :" + k) ;
		}
	 /*
	 @Test
		public void test334() throws ParseException {
		 SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		 Date d = dateFormat.parse("1970-02-02");
		 User u = new User(10L,d );
		 Contract c = new Contract(10000f ,u) ; 
		 float sm = is.TDEMPRUNTEUR(0.02, u, c) ;

		}
	 */
	 @Test
		public void testest(){
			TableMortalit√© t0=new TableMortalit√©(100000,100000,1,1f);	TableMortalit√© tm0=tr.Addtm(t0);
			TableMortalit√© t1=new TableMortalit√©(97104,97660,2,0.99431f);	TableMortalit√© tm1=tr.Addtm(t1);
			TableMortalit√© t2=new TableMortalit√©(96869,97436,3,0.99418f);	TableMortalit√© tm2=tr.Addtm(t2);
			TableMortalit√© t3=new TableMortalit√©(96727,97311,4,0.994f);	TableMortalit√© tm3=tr.Addtm(t3);
			TableMortalit√© t4=new TableMortalit√©(96624,97223,5,0.99384f);	TableMortalit√© tm4=tr.Addtm(t4);
			TableMortalit√© t5=new TableMortalit√©(96541,97156,6,0.99367f);	TableMortalit√© tm5=tr.Addtm(t5);
			TableMortalit√© t6=new TableMortalit√©(96471,97100,7,0.99352f);	TableMortalit√© tm6=tr.Addtm(t6);
			TableMortalit√© t7=new TableMortalit√©(96410,97051,8,0.9934f);	TableMortalit√© tm7=tr.Addtm(t7);
			TableMortalit√© t8=new TableMortalit√©(96356,97006,9,0.9933f);	TableMortalit√© tm8=tr.Addtm(t8);
			TableMortalit√© t9=new TableMortalit√©(96306,96964,10,0.99321f);	TableMortalit√© tm9=tr.Addtm(t9);
			TableMortalit√© t10=new TableMortalit√©(96258,96923,11,0.99314f);	TableMortalit√© tm10=tr.Addtm(t10);
			TableMortalit√© t11=new TableMortalit√©(96211,96883,12,0.99306f);	TableMortalit√© tm11=tr.Addtm(t11);
			TableMortalit√© t12=new TableMortalit√©(96163,96842,13,0.99299f);	TableMortalit√© tm12=tr.Addtm(t12);
			TableMortalit√© t13=new TableMortalit√©(96111,96800,14,0.99288f);	TableMortalit√© tm13=tr.Addtm(t13);
			TableMortalit√© t14=new TableMortalit√©(96052,96758,15,0.9927f);	TableMortalit√© tm14=tr.Addtm(t14);
			TableMortalit√© t15=new TableMortalit√©(95985,96713,16,0.99247f);	TableMortalit√© tm15=tr.Addtm(t15);
			TableMortalit√© t16=new TableMortalit√©(95908,96667,17,0.99215f);	TableMortalit√© tm16=tr.Addtm(t16);
			TableMortalit√© t17=new TableMortalit√©(95821,96619,18,0.99174f);	TableMortalit√© tm17=tr.Addtm(t17);
			TableMortalit√© t18=new TableMortalit√©(95722,96569,19,0.99123f);	TableMortalit√© tm18=tr.Addtm(t18);
			TableMortalit√© t19=new TableMortalit√©(95614,96517,20,0.99064f);	TableMortalit√© tm19=tr.Addtm(t19);
			TableMortalit√© t20=new TableMortalit√©(95496,96462,21,0.98999f);	TableMortalit√© tm20=tr.Addtm(t20);
			TableMortalit√© t21=new TableMortalit√©(95372,96405,22,0.98928f);	TableMortalit√© tm21=tr.Addtm(t21);
			TableMortalit√© t22=new TableMortalit√©(95242,96346,23,0.98854f);	TableMortalit√© tm22=tr.Addtm(t22);
			TableMortalit√© t23=new TableMortalit√©(95108,96284,24,0.98779f);	TableMortalit√© tm23=tr.Addtm(t23);
			TableMortalit√© t24=new TableMortalit√©(94971,96219,25,0.98703f);	TableMortalit√© tm24=tr.Addtm(t24);
			TableMortalit√© t25=new TableMortalit√©(94834,96151,26,0.9863f);	TableMortalit√© tm25=tr.Addtm(t25);
			TableMortalit√© t26=new TableMortalit√©(94696,96080,27,0.9856f);	TableMortalit√© tm26=tr.Addtm(t26);
			TableMortalit√© t27=new TableMortalit√©(94558,96006,28,0.98492f);	TableMortalit√© tm27=tr.Addtm(t27);
			TableMortalit√© t28=new TableMortalit√©(94420,95929,29,0.98427f);	TableMortalit√© tm28=tr.Addtm(t28);
			TableMortalit√© t29=new TableMortalit√©(94283,95849,30,0.98366f);	TableMortalit√© tm29=tr.Addtm(t29);
			TableMortalit√© t30=new TableMortalit√©(94145,95765,31,0.98308f);	TableMortalit√© tm30=tr.Addtm(t30);
			TableMortalit√© t31=new TableMortalit√©(94007,95677,32,0.98255f);	TableMortalit√© tm31=tr.Addtm(t31);
			TableMortalit√© t32=new TableMortalit√©(93867,95585,33,0.98203f);	TableMortalit√© tm32=tr.Addtm(t32);
			TableMortalit√© t33=new TableMortalit√©(93724,95488,34,0.98153f);	TableMortalit√© tm33=tr.Addtm(t33);
			TableMortalit√© t34=new TableMortalit√©(93578,95387,35,0.98104f);	TableMortalit√© tm34=tr.Addtm(t34);
			TableMortalit√© t35=new TableMortalit√©(93426,95281,36,0.98053f);	TableMortalit√© tm35=tr.Addtm(t35);
			TableMortalit√© t36=new TableMortalit√©(93268,95170,37,0.98001f);	TableMortalit√© tm36=tr.Addtm(t36);
			TableMortalit√© t37=new TableMortalit√©(93102,95052,38,0.97948f);	TableMortalit√© tm37=tr.Addtm(t37);
			TableMortalit√© t38=new TableMortalit√©(92926,94928,39,0.97891f);	TableMortalit√© tm38=tr.Addtm(t38);
			TableMortalit√© t39=new TableMortalit√©(92739,94796,40,0.9783f);	TableMortalit√© tm39=tr.Addtm(t39);
			TableMortalit√© t40=new TableMortalit√©(92538,94656,41,0.97762f);	TableMortalit√© tm40=tr.Addtm(t40);
			TableMortalit√© t41=new TableMortalit√©(92323,94508,42,0.97688f);	TableMortalit√© tm41=tr.Addtm(t41);
			TableMortalit√© t42=new TableMortalit√©(92089,94350,43,0.97604f);	TableMortalit√© tm42=tr.Addtm(t42);
			TableMortalit√© t43=new TableMortalit√©(91837,94180,44,0.97512f);	TableMortalit√© tm43=tr.Addtm(t43);
			TableMortalit√© t44=new TableMortalit√©(91562,93999,45,0.97407f);	TableMortalit√© tm44=tr.Addtm(t44);
			TableMortalit√© t45=new TableMortalit√©(91263,93804,46,0.97291f);	TableMortalit√© tm45=tr.Addtm(t45);
			TableMortalit√© t46=new TableMortalit√©(90937,93594,47,0.97161f);	TableMortalit√© tm46=tr.Addtm(t46);
			TableMortalit√© t47=new TableMortalit√©(90580,93367,48,0.97015f);	TableMortalit√© tm47=tr.Addtm(t47);
			TableMortalit√© t48=new TableMortalit√©(90190,93121,49,0.96852f);	TableMortalit√© tm48=tr.Addtm(t48);
			TableMortalit√© t49=new TableMortalit√©(89764,92854,50,0.96672f);	TableMortalit√© tm49=tr.Addtm(t49);
			TableMortalit√© t50=new TableMortalit√©(89297,92564,51,0.96471f);	TableMortalit√© tm50=tr.Addtm(t50);
			TableMortalit√© t51=new TableMortalit√©(88786,92247,52,0.96248f);	TableMortalit√© tm51=tr.Addtm(t51);
			TableMortalit√© t52=new TableMortalit√©(88226,91901,53,0.96001f);	TableMortalit√© tm52=tr.Addtm(t52);
			TableMortalit√© t53=new TableMortalit√©(87614,91523,54,0.95729f);	TableMortalit√© tm53=tr.Addtm(t53);
			TableMortalit√© t54=new TableMortalit√©(86944,91108,55,0.9543f);	TableMortalit√© tm54=tr.Addtm(t54);
			TableMortalit√© t55=new TableMortalit√©(86211,90651,56,0.95102f);	TableMortalit√© tm55=tr.Addtm(t55);
			TableMortalit√© t56=new TableMortalit√©(85410,90150,57,0.94742f);	TableMortalit√© tm56=tr.Addtm(t56);
			TableMortalit√© t57=new TableMortalit√©(84536,89597,58,0.94351f);	TableMortalit√© tm57=tr.Addtm(t57);
			TableMortalit√© t58=new TableMortalit√©(83582,88988,59,0.93925f);	TableMortalit√© tm58=tr.Addtm(t58);
			TableMortalit√© t59=new TableMortalit√©(82542,88317,60,0.93461f);	TableMortalit√© tm59=tr.Addtm(t59);
			TableMortalit√© t60=new TableMortalit√©(81409,87576,61,0.92958f);	TableMortalit√© tm60=tr.Addtm(t60);
			TableMortalit√© t61=new TableMortalit√©(80178,86757,62,0.92417f);	TableMortalit√© tm61=tr.Addtm(t61);
			TableMortalit√© t62=new TableMortalit√©(78842,85853,63,0.91834f);	TableMortalit√© tm62=tr.Addtm(t62);
			TableMortalit√© t63=new TableMortalit√©(77393,84856,64,0.91205f);	TableMortalit√© tm63=tr.Addtm(t63);
			TableMortalit√© t64=new TableMortalit√©(75826,83754,65,0.90534f);	TableMortalit√© tm64=tr.Addtm(t64);
			TableMortalit√© t65=new TableMortalit√©(74134,82540,66,0.89816f);	TableMortalit√© tm65=tr.Addtm(t65);
			TableMortalit√© t66=new TableMortalit√©(72312,81202,67,0.89052f);	TableMortalit√© tm66=tr.Addtm(t66);
			TableMortalit√© t67=new TableMortalit√©(70354,79729,68,0.88241f);	TableMortalit√© tm67=tr.Addtm(t67);
			TableMortalit√© t68=new TableMortalit√©(68257,78111,69,0.87385f);	TableMortalit√© tm68=tr.Addtm(t68);
			TableMortalit√© t69=new TableMortalit√©(66017,76337,70,0.86481f);	TableMortalit√© tm69=tr.Addtm(t69);
			TableMortalit√© t70=new TableMortalit√©(63632,74395,71,0.85533f);	TableMortalit√© tm70=tr.Addtm(t70);
			TableMortalit√© t71=new TableMortalit√©(61103,72275,72,0.84542f);	TableMortalit√© tm71=tr.Addtm(t71);
			TableMortalit√© t72=new TableMortalit√©(58432,69969,73,0.83511f);	TableMortalit√© tm72=tr.Addtm(t72);
			TableMortalit√© t73=new TableMortalit√©(55623,67469,74,0.82442f);	TableMortalit√© tm73=tr.Addtm(t73);
			TableMortalit√© t74=new TableMortalit√©(52686,64770,75,0.81343f);	TableMortalit√© tm74=tr.Addtm(t74);
			TableMortalit√© t75=new TableMortalit√©(49629,61869,76,0.80216f);	TableMortalit√© tm75=tr.Addtm(t75);
			TableMortalit√© t76=new TableMortalit√©(46469,58769,77,0.79071f);	TableMortalit√© tm76=tr.Addtm(t76);
			TableMortalit√© t77=new TableMortalit√©(43222,55474,78,0.77914f);	TableMortalit√© tm77=tr.Addtm(t77);
			TableMortalit√© t78=new TableMortalit√©(39911,51997,79,0.76756f);	TableMortalit√© tm78=tr.Addtm(t78);
			TableMortalit√© t79=new TableMortalit√©(36560,48356,80,0.75606f);	TableMortalit√© tm79=tr.Addtm(t79);
			TableMortalit√© t80=new TableMortalit√©(33200,44576,81,0.7448f);	TableMortalit√© tm80=tr.Addtm(t80);
			TableMortalit√© t81=new TableMortalit√©(29861,40689,82,0.73388f);	TableMortalit√© tm81=tr.Addtm(t81);
			TableMortalit√© t82=new TableMortalit√©(26580,36735,83,0.72356f);	TableMortalit√© tm82=tr.Addtm(t82);
			TableMortalit√© t83=new TableMortalit√©(23390,32762,84,0.71394f);	TableMortalit√© tm83=tr.Addtm(t83);
			TableMortalit√© t84=new TableMortalit√©(20328,28823,85,0.70527f);	TableMortalit√© tm84=tr.Addtm(t84);
			TableMortalit√© t85=new TableMortalit√©(17428,24976,86,0.69779f);	TableMortalit√© tm85=tr.Addtm(t85);
			TableMortalit√© t86=new TableMortalit√©(14722,21282,87,0.69176f);	TableMortalit√© tm86=tr.Addtm(t86);
			TableMortalit√© t87=new TableMortalit√©(12238,17799,88,0.68757f);	TableMortalit√© tm87=tr.Addtm(t87);
			TableMortalit√© t88=new TableMortalit√©(9997,14583,89,0.68552f);	TableMortalit√© tm88=tr.Addtm(t88);
			TableMortalit√© t89=new TableMortalit√©(8013,11679,90,0.6861f);	TableMortalit√© tm89=tr.Addtm(t89);
			TableMortalit√© t90=new TableMortalit√©(6292,9122,91,0.68976f);	TableMortalit√© tm90=tr.Addtm(t90);
			TableMortalit√© t91=new TableMortalit√©(4832,6931,92,0.69716f);	TableMortalit√© tm91=tr.Addtm(t91);
			TableMortalit√© t92=new TableMortalit√©(3623,5110,93,0.709f);	TableMortalit√© tm92=tr.Addtm(t92);
			TableMortalit√© t93=new TableMortalit√©(2647,3645,94,0.7262f);	TableMortalit√© tm93=tr.Addtm(t93);
			TableMortalit√© t94=new TableMortalit√©(1876,2498,95,0.751f);	TableMortalit√© tm94=tr.Addtm(t94);
			TableMortalit√© t95=new TableMortalit√©(1286,1637,96,0.78558f);	TableMortalit√© tm95=tr.Addtm(t95);
			TableMortalit√© t96=new TableMortalit√©(850,1019,97,0.83415f);	TableMortalit√© tm96=tr.Addtm(t96);
			TableMortalit√© t97=new TableMortalit√©(539,597,98,0.90285f);	TableMortalit√© tm97=tr.Addtm(t97);
			TableMortalit√© t98=new TableMortalit√©(326,326,99,1f);	TableMortalit√© tm98=tr.Addtm(t98);
			TableMortalit√© t99=new TableMortalit√©(187,164,100,1.14024f);	TableMortalit√© tm99=tr.Addtm(t99);
			TableMortalit√© t100=new TableMortalit√©(101,75,101,1.34667f);	TableMortalit√© tm100=tr.Addtm(t100);
			TableMortalit√© t101=new TableMortalit√©(51,30,102,1.7f);	TableMortalit√© tm101=tr.Addtm(t101);
			TableMortalit√© t102=new TableMortalit√©(24,10,103,2.4f);	TableMortalit√© tm102=tr.Addtm(t102);
			TableMortalit√© t103=new TableMortalit√©(10,3,104,3.33333f);	TableMortalit√© tm103=tr.Addtm(t103);
			TableMortalit√© t104=new TableMortalit√©(4,1,105,4f);	TableMortalit√© tm104=tr.Addtm(t104);
			TableMortalit√© t105=new TableMortalit√©(1,0,106,0f);	TableMortalit√© tm105=tr.Addtm(t105);
			TableMortalit√© t106=new TableMortalit√©(0,0,107,0f);	TableMortalit√© tm106=tr.Addtm(t106);
			TableMortalit√© t107=new TableMortalit√©(0,0,108,0f);	TableMortalit√© tm107=tr.Addtm(t107);
			TableMortalit√© t108=new TableMortalit√©(0,0,109,0f);	TableMortalit√© tm108=tr.Addtm(t108);
			TableMortalit√© t109=new TableMortalit√©(0,0,110,0f);	TableMortalit√© tm109=tr.Addtm(t109);
			TableMortalit√© t110=new TableMortalit√©(0,0,111,0f);	TableMortalit√© tm110=tr.Addtm(t110);
			TableMortalit√© t111=new TableMortalit√©(0,0,112,0f);	TableMortalit√© tm111=tr.Addtm(t111);
			TableMortalit√© t112=new TableMortalit√©(0,0,113,0f);	TableMortalit√© tm112=tr.Addtm(t112);
			TableMortalit√© t113=new TableMortalit√©(0,0,114,0f);	TableMortalit√© tm113=tr.Addtm(t113);
			TableMortalit√© t114=new TableMortalit√©(0,0,115,0f);	TableMortalit√© tm114=tr.Addtm(t114);
			TableMortalit√© t115=new TableMortalit√©(0,0,116,0f);	TableMortalit√© tm115=tr.Addtm(t115);
			TableMortalit√© t116=new TableMortalit√©(0,0,117,0f);	TableMortalit√© tm116=tr.Addtm(t116);
			TableMortalit√© t117=new TableMortalit√©(0,0,118,0f);	TableMortalit√© tm117=tr.Addtm(t117);
			TableMortalit√© t118=new TableMortalit√©(0,0,119,0f);	TableMortalit√© tm118=tr.Addtm(t118);
			TableMortalit√© t119=new TableMortalit√©(0,0,120,0f);	TableMortalit√© tm119=tr.Addtm(t119);
		}
		

	

	
}
    
    