import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

public class Parayno_Cartoon extends JFrame
{
    private JFrame frame;
    
    public Parayno_Cartoon()
    {
        frame = new JFrame("Parayno Cartoon");
        setTitle("Parayno Cartoon");
        setSize(850,510);
        setBackground(Color.black);
        setVisible(true);

        addWindowListener(new MyFinishWindow());
    }
    
    public static void main(String[] args) 
    {
        Parayno_Cartoon mParayno_Cartoon = new Parayno_Cartoon ();
    }
    
    //@Override
    public void paint(Graphics g)
    {
        //Initalization
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath aura = new GeneralPath();
        GeneralPath rGreenHair = new GeneralPath();
        GeneralPath lGreenHair = new GeneralPath();
        GeneralPath hair = new GeneralPath();
        GeneralPath face = new GeneralPath();
        GeneralPath rEar = new GeneralPath();
        GeneralPath neck = new GeneralPath();
        GeneralPath nose = new GeneralPath();
        GeneralPath tongue = new GeneralPath();
        GeneralPath lEyebrow = new GeneralPath();
        GeneralPath rEyebrow = new GeneralPath();
        GeneralPath rRed = new GeneralPath();
        GeneralPath lRed = new GeneralPath();
        GeneralPath rDGreen = new GeneralPath();
        GeneralPath lDGreen = new GeneralPath();
        GeneralPath rGreen = new GeneralPath();
        GeneralPath lGreen = new GeneralPath();
        GeneralPath rHand = new GeneralPath();
        GeneralPath lHand = new GeneralPath();
        GeneralPath rWPN = new GeneralPath();
        GeneralPath lWPN = new GeneralPath(); 
        GeneralPath lWPNg = new GeneralPath();
        GeneralPath line = new GeneralPath();
        GeneralPath line2 = new GeneralPath();
        GeneralPath line3 = new GeneralPath();
        GeneralPath rEye = new GeneralPath();
        GeneralPath rbEye = new GeneralPath();
        GeneralPath lEye = new GeneralPath();
        GeneralPath lbEye = new GeneralPath();
        GeneralPath rIris = new GeneralPath();
        GeneralPath lIris = new GeneralPath();
        
        //g2d.setColor(Color.black);
        g2d.setColor(Color.black);
        g2d.fillRect(0,0,850,510);
        g2d.translate(0,30);
        
        //RIGHT FACE BODY AURA
        aura.moveTo(250,0);
        aura.lineTo(327,180);
        aura.curveTo(325,208,326,228,340,261);
        aura.curveTo(347,281,371,305,391,315);
        aura.lineTo(418,334);
        aura.lineTo(440,347);
        aura.curveTo(412,355,404,359,401,372);
        aura.quadTo(403,394,402,415);
        aura.curveTo(396,415,392,420,386,424);
        aura.curveTo(301,445,296,447,290,452);
        aura.lineTo(270,480);
        //RIGHT HAND AURA//
        aura.lineTo(186,480);
        aura.curveTo(186,480,184,454,161,434);
        aura.curveTo(158,423,151,416,140,410);
        aura.curveTo(152,404,159,391,158,376);
        aura.curveTo(148,368,132,363,118,351);
        aura.curveTo(105,343,93,344,86,344);
        aura.curveTo(76,340,64,341,56,346);
        aura.curveTo(50,352,19,376,13,402);
        aura.quadTo(4,468,10,480);
        //LEFT HAND AURA
        aura.lineTo(825,480);
        aura.curveTo(825,480,820,463,833,413);
        aura.curveTo(827,395,803,342,746,335);
        aura.curveTo(726,334,713,339,696,338);
        aura.curveTo(685,343,677,358,665,379);
        aura.curveTo(651,394,636,394,632,386);
        //LEFT FACE BODY AURA
        aura.lineTo(632,350);
        aura.curveTo(632,344,625,338,613,333);
        aura.lineTo(593,331);
        aura.lineTo(601,273);
        aura.curveTo(617,260,629,259,638,253);
        aura.curveTo(669,222,674,210,675,200);
        aura.curveTo(842,51,841,41,832,40);
        aura.lineTo(737,77);
        aura.lineTo(797,0);
        aura.closePath();
    
        //g2d.setColor(new Color(255, 91,0));       // Bright Orange
        //g2d.fill(aura);
        
        //RIGHT GREEN HAIR
        rGreenHair.moveTo(258,0);
        rGreenHair.lineTo(287,0);
        rGreenHair.lineTo(304,20);
        rGreenHair.lineTo(303,0);  
        rGreenHair.lineTo(314,0);                   //HAIR OVERLAP
        rGreenHair.lineTo(316,49);                  //HAIR OVERLAP
        rGreenHair.lineTo(275,3);                   //HAIR OVERLAP
        rGreenHair.lineTo(325,120);                 //HAIR OVERLAP - SKIN OVERLAP
        rGreenHair.lineTo(325,145);                 //SKIN OVERLAP
        rGreenHair.lineTo(338,179);                 //SKIN OVERLAP
        rGreenHair.lineTo(333,182); 
        rGreenHair.closePath();
        
        g2d.setColor(new Color(93,137,86));
        g2d.fill(rGreenHair);
        //g2d.setColor(new Color(37,37,39));
        
        //LEFT GREEN HAIR
        lGreenHair.moveTo(767,0);                   //HAIR OVERLAP
        lGreenHair.lineTo(681,120);                 //HAIR OVERLAP
        lGreenHair.lineTo(763,87);                  //HAIR OVERLAP
        lGreenHair.lineTo(668,180);                 //HAIR OVERLAP - SKIN OVERLAP
        lGreenHair.lineTo(669,194);                 //SKIN OVERLAP
        lGreenHair.lineTo(826,49);  
        lGreenHair.lineTo(704,104);   
        lGreenHair.lineTo(786,0); 
        lGreenHair.closePath();
        
        g2d.setColor(new Color(93,137,86));
        g2d.fill(lGreenHair);
        //g2d.setColor(new Color(37,37,39));
        
        //HAIR
        hair.moveTo(314,0);                         //RG HAIR OVERLAP
        hair.lineTo(316,49);                        //RG HAIR OVERLAP
        hair.lineTo(275,3);                         //RG HAIR OVERLAP
        hair.lineTo(325,120);                       //RG HAIR OVERLAP - SKIN OVERLAP
        hair.lineTo(328,89);                        //SKIN OVERLAP
        hair.lineTo(349,77);                        //SKIN OVERLAP
        hair.lineTo(330,64);                        //SKIN OVERLAP
        hair.lineTo(379,68);                        //SKIN OVERLAP
        hair.lineTo(354,39);                        //SKIN OVERLAP
        hair.lineTo(402,60);                        //SKIN OVERLAP
        hair.lineTo(383,30);                        //SKIN OVERLAP
        hair.curveTo(431,57,435,58,438,56);         //SKIN OVERLAP
        hair.quadTo(465,32,490,15);                 //SKIN OVERLAP
        hair.lineTo(470,48);                        //SKIN OVERLAP
        hair.quadTo(513,27,557,10);                 //SKIN OVERLAP
        hair.quadTo(540,25,521,45);                 //SKIN OVERLAP
        hair.quadTo(558,34,607,27);                 //SKIN OVERLAP
        hair.quadTo(591,33,569,42);                 //SKIN OVERLAP
        hair.quadTo(594,59,614,78);                 //SKIN OVERLAP
        hair.quadTo(593,71,574,65);                 //SKIN OVERLAP
        hair.lineTo(622,126);                       //SKIN OVERLAP
        hair.lineTo(591,104);                       //SKIN 
        hair.lineTo(610,150);                       //SKIN OVERLAP
        hair.lineTo(601,146);                       //SKIN OVERLAP
        hair.quadTo(607,159,614,172);               //SKIN OVERLAP
        hair.curveTo(630,156,648,149,656,153);      //SKIN OVERLAP
        hair.curveTo(664,163,667,172,668,180);      //SKIN OVERLAP
        hair.lineTo(763,87);                        //HAIR OVERLAP
        hair.lineTo(681,120);                       //HAIR OVERLAP 
        hair.lineTo(767,0);                         //HAIR OVERLAP
        hair.closePath();
        
        g2d.setColor(new Color(37,37,39));
        g2d.fill(hair);
        
        //FACE
        face.moveTo(338,179);                       //SKIN OVERLAP
        face.lineTo(325,145);                       //SKIN OVERLAP
        face.lineTo(325,120);                       //HAIR OVERLAP - SKIN OVERLAP
        face.lineTo(328,89);                        //SKIN OVERLAP
        face.lineTo(349,77);                        //SKIN OVERLAP
        face.lineTo(330,64);                        //SKIN OVERLAP
        face.lineTo(379,68);                        //SKIN OVERLAP
        face.lineTo(354,39);                        //SKIN OVERLAP
        face.lineTo(402,60);                        //SKIN OVERLAP
        face.lineTo(383,30);                        //SKIN OVERLAP
        face.curveTo(431,57,435,58,438,56);         //SKIN OVERLAP
        face.quadTo(465,32,490,15);                 //SKIN OVERLAP
        face.lineTo(470,48);                        //SKIN OVERLAP
        face.quadTo(513,27,557,10);                 //SKIN OVERLAP
        face.quadTo(540,25,521,45);                 //SKIN OVERLAP
        face.quadTo(558,34,607,27);                 //SKIN OVERLAP
        face.quadTo(591,33,569,42);                 //SKIN OVERLAP
        face.quadTo(594,59,614,78);                 //SKIN OVERLAP
        face.quadTo(593,71,574,65);                 //SKIN OVERLAP
        face.lineTo(622,126);                       //SKIN OVERLAP
        face.lineTo(591,104);                       //SKIN 
        face.lineTo(610,150);                       //SKIN OVERLAP
        face.lineTo(601,146);                       //SKIN OVERLAP
        face.quadTo(607,159,614,172);               //SKIN OVERLAP
        face.curveTo(630,156,648,149,656,153);      //SKIN OVERLAP
        face.curveTo(664,163,667,172,668,180);      //SKIN OVERLAP
        face.lineTo(669,194);                       //SKIN OVERLAP
        face.curveTo(667,207,662,218,652,227);
        face.curveTo(636,241,625,251,619,253);
        face.quadTo(605,250,591,265);               //NECK OVERLAP
        face.curveTo(572,285,542,310,495,340);      //NECK OVERLAP
        face.curveTo(480,347,466,350,457,349);      //NECK OVERLAP
        face.curveTo(437,337,422,325,397,310);  
        face.curveTo(373,294,363,286,352,273);      
        face.quadTo(348,263,346,251);               //EAR OVERLAP
        face.lineTo(347,209);                       //EAR OVERLAP
        face.curveTo(345,197,342,187,338,179);      //EAR OVERLAP
        
        g2d.setColor(new Color(251,228,197));
        g2d.fill(face);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(face);
        
        //RIGHT EAR
        rEar.moveTo(346,251);                       //EAR OVERLAP
        rEar.lineTo(347,209);                       //EAR OVERLAP
        rEar.curveTo(345,197,342,187,338,179);      //EAR OVERLAP
        rEar.lineTo(333,182); 
        rEar.curveTo(331,187,330,205,331,217);  
        rEar.quadTo(335,233,346,251);
        
        g2d.setColor(new Color(251,228,197));
        g2d.fill(rEar);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rEar);
        
        //NECK
        neck.moveTo(591,265);
        neck.curveTo(572,285,542,310,495,340);      //FACE OVERLAP
        neck.curveTo(480,347,466,350,457,349);      //FACE OVERLAP
        neck.lineTo(457,354);                       //rRED OVERLAP
        neck.quadTo(464,357,468,363);               //rRED OVERLAP
        neck.curveTo(478,352,533,341,585,339);      //lRED OVERLAP
        neck.quadTo(586,324,587,308); 
        neck.curveTo(589,293,591,278,591,265); 
    
        //g2d.setColor(new Color(191,132,116));
        g2d.setColor(new Color(251,228,197));
        g2d.fill(neck);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(neck);
        
        //RIGHT RED
        rRed.moveTo(404,369);
        rRed.curveTo(425,356,448,353,457,354);      //NECK OVERLAP
        rRed.quadTo(464,357,468,363);               //NECK OVERLAP-lRED OVERLAP
        rRed.lineTo(467,420);                       //lRED OVERLAP
        rRed.quadTo(465,429,464,441);               //lRED OVERLAP
        rRed.curveTo(460,448,456,454,461,460);      //lRED OVERLAP
        rRed.quadTo(460,468,459,480);               //lRED OVERLAP
        rRed.lineTo(438,480);                       //rGreen OVERLAP
        rRed.curveTo(440,467,438,452,447,441);      //rGreen OVERLAP-rDGreen OVERLAP
        rRed.lineTo(447,389);                       //rDGreen OVERLAP
        rRed.curveTo(443,379,438,373,423,374);      //rDGreen OVERLAP
        rRed.lineTo(409,379);                       //rDGreen OVERLAP
        rRed.closePath();
        
        g2d.setColor(new Color(211,70,50));
        g2d.fill(rRed);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rRed);
        
        //RIGHT DARK GREEN
        rDGreen.moveTo(447,441);
        rDGreen.lineTo(447,389);                    //rDGreen OVERLAP
        rDGreen.curveTo(443,379,438,373,423,374);   //rDGreen OVERLAP
        rDGreen.lineTo(409,379);                       
        rDGreen.lineTo(407,422);                    //rGreen OVERLAP
        rDGreen.curveTo(415,433,429,438,447,441);   //rGreen OVERLAP
        
        g2d.setColor(new Color(32,84,48));
        g2d.fill(rDGreen);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rDGreen);
        
        //RIGHT GREEN
        rGreen.moveTo(438,480);                     //rGreen OVERLAP
        rGreen.curveTo(440,467,438,452,447,441);    //rGreen OVERLAP-rDGreen OVERLAP
        rGreen.curveTo(429,438,415,433,407,422);   
        rGreen.lineTo(398,422);
        rGreen.curveTo(388,430,361,441,345,444);
        rGreen.curveTo(322,452,298,452,280,480);
        rGreen.closePath();
        
        g2d.setColor(new Color(94,197,80));
        g2d.fill(rGreen);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rGreen);
        
        //LEFT RED
        lRed.moveTo(468,363);                       //NECK OVERLAP-lRED OVERLAP
        lRed.lineTo(467,420);                       //lRED OVERLAP
        lRed.quadTo(465,429,464,441);               //lRED OVERLAP
        lRed.curveTo(460,448,456,454,461,460);      //lRED OVERLAP
        lRed.quadTo(460,468,459,480);               //lRED OVERLAP
        lRed.lineTo(482,480);                       //lGreen OVERLAP
        lRed.curveTo(482,467,481,456,487,445);      //lDGreen OVERLAP-lGreen OVERLAP
        lRed.curveTo(487,404,497,374,538,363);      //lDGreen OVERLAP
        lRed.quadTo(576,352,623,372);               //lDGreen OVERLAP
        lRed.lineTo(627,353); 
        lRed.quadTo(621,347,585,339); 
        lRed.curveTo(533,341,478,352,468,363);    
        
        g2d.setColor(new Color(211,70,50));
        g2d.fill(lRed);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(lRed);
        
        //LEFT DARK GREEN
        lDGreen.moveTo(487,445);
        lDGreen.curveTo(487,404,497,374,538,363);   
        lDGreen.quadTo(576,352,623,372);   
        lDGreen.lineTo(624,407);
        lDGreen.quadTo(562,433,487,445); 
        
        g2d.setColor(new Color(32,84,48));
        g2d.fill(lDGreen);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(lDGreen);
        
        //LEFT GREEN
        lGreen.moveTo(482,480);                                     //lGreen OVERLAP
        lGreen.curveTo(482,467,481,456,487,445);      //lDGreen OVERLAP-lGreen OVERLAP
        lGreen.quadTo(562,433,624,407); 
        lGreen.curveTo(627,401,637,400,654,413);      //lHand OVERLAP
        lGreen.curveTo(757,426,780,435,791,442);      //IMAGINARY DOTS
        lGreen.quadTo(810,464,817,480);                     //lHand OVERLAP
        lGreen.closePath();
       
        g2d.setColor(new Color(94,197,80));
        g2d.fill(lGreen);
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(lGreen);

        //NOSE
        nose.moveTo(418,211);
        nose.lineTo(437,246);
        nose.curveTo(434,237,429,226,426,211);
        nose.closePath();
        
        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.fill(nose);
        
        //TONGUE
        tongue.moveTo(428,272);
        tongue.quadTo(451,265,473,267);
        tongue.curveTo(465,277,457,290,450,293);
        tongue.curveTo(437,296,426,286,428,272);

        g2d.setColor(new Color(239,169,167));
        g2d.fill(tongue);
        g2d.setStroke(new BasicStroke(2F));
        g2d.setColor(new Color(37,37,39));
        g2d.draw(tongue);
       
        //LEFT EYEBROW
        lEyebrow.moveTo(471,103);
        lEyebrow.lineTo(506,77);
        lEyebrow.lineTo(518,72);
        lEyebrow.lineTo(528,70);
        lEyebrow.lineTo(533,70);
        lEyebrow.lineTo(542,73);
        lEyebrow.lineTo(555,82);
        lEyebrow.lineTo(575,99);
        lEyebrow.lineTo(554,83);
        lEyebrow.lineTo(541,75);
        lEyebrow.lineTo(534,73);
        lEyebrow.lineTo(529,73);
        lEyebrow.lineTo(520,74);
        lEyebrow.lineTo(507,79);
        lEyebrow.closePath();
    
        g2d.setColor(new Color(37,37,39));
        g2d.fill(lEyebrow);
        g2d.setColor(new Color(37,37,39));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(lEyebrow);
        
        //RIGHT EYEBROW
        rEyebrow.moveTo(413,115);
        rEyebrow.lineTo(390,101);
        rEyebrow.lineTo(373,96);
        rEyebrow.lineTo(359,94);
        rEyebrow.lineTo(353,96);
        rEyebrow.lineTo(349,99);
        rEyebrow.lineTo(340,110);
        rEyebrow.lineTo(328,131);
        rEyebrow.lineTo(341,111);
        rEyebrow.lineTo(351,101);
        rEyebrow.lineTo(355,99);
        rEyebrow.lineTo(359,98);
        rEyebrow.lineTo(373,98);
        rEyebrow.lineTo(390,102);
        rEyebrow.closePath();
    
        g2d.setColor(new Color(37,37,39));
        g2d.fill(rEyebrow);
        g2d.setColor(new Color(37,37,39));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rEyebrow);
 
        //----------LINES----------///
        //RIGHT EAR LINE
        line.moveTo(347,209);                       
        line.quadTo(341,200,335,193);
        //RED PART LINE
        line.moveTo(447,441);
        line.quadTo(464,441,486,445);
        //NOSE
        line.moveTo(426,211);
        line.curveTo(430,207,437,199,435,190);
        //TONGUE
        line.moveTo(423,268);
        line.lineTo(428,272);
        line.quadTo(451,265,473,267);
        line.quadTo(485,269,490,265);
        //LEFT EAR
        line.moveTo(612,232);
        line.lineTo(614,228);
        line.lineTo(618,217);
        line.curveTo(627,210,628,200,623,189);
        line.curveTo(630,176,639,166,647,162);
        line.curveTo(657,166,661,172,662,181);
        line.moveTo(632,176);
        line.quadTo(639,178,647,188);
        line.quadTo(648,209,638,225);
        line.lineTo(614,228);

        g2d.setColor(new Color(37,37,39));
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(line);
 
        //RIGHT EYE
        g2d.setColor(new Color(253,253,253));
        g2d.fillOval(353,131,64,88);
        rEye.moveTo(381,218);
        rEye.quadTo(372,217,363,213);
        rEye.lineTo(355,192);
        rEye.moveTo(415,182);
        rEye.curveTo(415,197,407,211,389,218);
        rEye.closePath();
        
        g2d.setColor(new Color(253,253,253));
        g2d.fill(rEye);
        
        rbEye.moveTo(363,213);
        rbEye.curveTo(352,189,353,174,354,165);
        rbEye.curveTo(358,144,366,134,378,127);
        rbEye.curveTo(390,127,407,139,415,159);
        rbEye.curveTo(406,141,390,130,378,131);
        rbEye.curveTo(368,137,359,147,355,165);
        rbEye.curveTo(353,174,353,189,363,213);

        g2d.setColor(new Color(37,37,39));
        g2d.fill(rbEye);
        g2d.setColor(new Color(37,37,39));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(rbEye);
 
        g2d.setColor(new Color(60,54,56));
        g2d.fillOval(371,140,41,75);
        
        g2d.setColor(new Color(253,253,253));
        g2d.fillOval(371,151,19,23);
        //RIGHT IRIS
        rIris.moveTo(375,181);
        rIris.lineTo(386,172);
        rIris.lineTo(386,181);
        rIris.curveTo(388,188,394,195,401,188);
        rIris.lineTo(402,180);
        rIris.lineTo(402,166);
        rIris.lineTo(407,168);
        rIris.curveTo(408,187,407,196,403,203);
        rIris.curveTo(399,207,391,209,383,206);
        rIris.curveTo(378,199,375,191,375,181);
        
        g2d.setColor(new Color(198,129,92));
        //g2d.setColor(new Color(120,85,47));
        g2d.fill(rIris);
       
        //LEFT EYE
        g2d.setColor(new Color(253,253,253));
        g2d.fillOval(488,108,78,89);
        
        lEye.moveTo(522,196);
        lEye.curveTo(501,194,490,180,488,161);
        lEye.lineTo(565,164);
        lEye.lineTo(561,185);
        lEye.quadTo(531,196,522,196);

        g2d.setColor(new Color(253,253,253));
        g2d.fill(lEye);
        
        lbEye.moveTo(559,185);
        lbEye.lineTo(564,171);
        lbEye.lineTo(566,153);
        lbEye.curveTo(564,137,560,128,549,117);
        lbEye.curveTo(535,108,515,109,501,120);
        lbEye.quadTo(489,135,487,149);
        lbEye.quadTo(488,133,500,119);
        lbEye.curveTo(514,106,535,104,550,116);
        lbEye.curveTo(561,127,565,136,566,153);
        lbEye.lineTo(564,171);
        lbEye.closePath();
        
        g2d.setColor(new Color(37,37,39));
        g2d.fill(lbEye);
        g2d.setColor(new Color(37,37,39));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2F));
        g2d.draw(lbEye);
        
        g2d.setColor(new Color(60,54,56));
        g2d.fillOval(494,120,47,75);
        
        g2d.setColor(new Color(253,253,253));
        g2d.fillOval(495,129,21,21);
        
        //LEFT IRIS
        lIris.moveTo(498,161);
        lIris.lineTo(507,152);
        lIris.lineTo(507,160);
        lIris.curveTo(510,168,519,176,529,165);
        lIris.lineTo(530,154);
        lIris.lineTo(529,144);
        lIris.lineTo(536,152);
        lIris.curveTo(536,167,534,174,532,179);
        lIris.curveTo(528,186,517,192,507,186);
        lIris.curveTo(502,179,499,169,498,161);

        //g2d.setColor(new Color(120,85,47));
        g2d.setColor(new Color(198,129,92)); 
        g2d.fill(lIris);
        
        //Animation: Show hands
        try
        {
            Thread.sleep(500L);
            
            //LEFT HAND
            lHand.moveTo(653,413); 
            lHand.curveTo(658,400,671,386,681,370);
            lHand.curveTo(689,354,694,348,702,348);
            lHand.lineTo(712,352);
            lHand.quadTo(721,342,735,341);
            lHand.lineTo(743,343);
            lHand.curveTo(765,344,794,343,799,351);
            lHand.quadTo(824,407,819,432);
            lHand.quadTo(810,464,805,480);
            
            lHand.lineTo(658,480);
            lHand.curveTo(658,468,664,458,668,447);
            lHand.lineTo(675,441);
            lHand.curveTo(676,432,682,422,687,414);
            lHand.curveTo(671,423,664,421,653,413);
            
            g2d.setColor(new Color(251,228,197));
            g2d.fill(lHand);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lHand);
        

            //LEFT WEAPON
            lWPN.moveTo(743,343);
            lWPN.curveTo(765,344,794,343,799,351);
            lWPN.lineTo(850,252);
            lWPN.lineTo(850,177);
            lWPN.quadTo(836,177,825,179);
            lWPN.lineTo(743,343);
            
            g2d.setColor(new Color(236,237,219));
            g2d.fill(lWPN);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lWPN);
            
            //LEFT WEAPON GRAY
            lWPNg.moveTo(850,177);
            lWPNg.quadTo(836,177,825,179);
            lWPNg.lineTo(850,135);
            lWPNg.closePath();
            
            g2d.setColor(new Color(100,95,99));
            g2d.fill(lWPNg);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lWPNg);

            //----------LINES-2--------///

            //LEFT HAND LINES
            line2.moveTo(680,479);
            line2.lineTo(671,473);
            line2.moveTo(672,479);
            line2.lineTo(676,476);
            line2.moveTo(676,441);
            line2.curveTo(682,440,706,452,748,473);
            line2.moveTo(687,414);
            line2.lineTo(689,410);
            line2.lineTo(694,407);
            line2.curveTo(720,415,744,431,772,445);
            line2.moveTo(689,410);
            line2.curveTo(689,396,697,385,710,373);
            line2.curveTo(710,365,712,358,713,352);
            line2.moveTo(710,373);
            line2.quadTo(742,366,751,371);
            line2.curveTo(774,403,782,413,795,420);
            line2.moveTo(818,424);
            line2.curveTo(805,442,806,458,793,471);
            line2.moveTo(658,401);
            line2.curveTo(657,408,664,409,669,408);
            line2.quadTo(669,408,682,399);
            //LEFT WEAPON LINES
            line2.moveTo(758,314);
            line2.quadTo(788,311,812,324);
            line2.moveTo(773,280);
            line2.quadTo(807,286,824,301);
            line2.moveTo(780,266);
            line2.quadTo(813,272,829,292);
            line2.moveTo(793,243);
            line2.quadTo(818,245,845,255);
            line2.moveTo(804,223);
            line2.quadTo(826,218,846,220);
            line2.moveTo(811,205);
            line2.quadTo(831,210,847,215);

            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(line2);

            Thread.sleep(650L);
            
            //RIGHT HAND
            rHand.moveTo(179,480); 
            rHand.curveTo(178,466,174,459,172,454);
            rHand.lineTo(161,443);
            rHand.lineTo(153,440); 
            rHand.quadTo(150,426,131,414);
            rHand.lineTo(127,403);
            rHand.lineTo(145,400);
            rHand.curveTo(152,392,153,382,145,376);
            rHand.quadTo(129,373,102,352);
            rHand.lineTo(87,356);
            rHand.curveTo(81,350,75,346,55,359);
            rHand.lineTo(28,381);
            rHand.curveTo(20,390,19,405,18,424);
            rHand.lineTo(14,446);
            rHand.lineTo(14,469);
            rHand.lineTo(23,480);
            rHand.closePath();
            
            g2d.setColor(new Color(251,228,197));
            g2d.fill(rHand);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rHand);
            
            //RIGHT WEAPON 
            rWPN.moveTo(55,359);
            rWPN.lineTo(28,381);
            rWPN.quadTo(20,390,19,405);
            rWPN.lineTo(0,385);
            rWPN.lineTo(0,300);
            rWPN.closePath();
            
            g2d.setColor(new Color(236,237,219));
            g2d.fill(rWPN);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rWPN);
            
            //----------LINES-2--------///
            
            //RIGHT HAND LINES
            line3.moveTo(168,480);
            line3.lineTo(171,475);
            line3.moveTo(153,440);
            line3.curveTo(139,446,126,460,113,479);
            line3.moveTo(131,414);
            line3.curveTo(110,410,83,455,72,462);
            line3.moveTo(101,377);
            line3.curveTo(69,382,53,421,39,451); 
            line3.moveTo(101,377);
            line3.quadTo(117,376,127,403);
            line3.moveTo(101,377);
            line3.quadTo(96,364,87,356);
            //RIGHT WEAPON LINES
            line3.moveTo(37,341);
            line3.quadTo(20,339,0,347);
            line3.moveTo(37,341);
            line3.quadTo(9,353,0,385);
            
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(line3);
            
            Thread.sleep(950L); 

            //---EYES ANIMATION---//
            int i = 0,x = 0;
            do
            {   
                g2d.setColor(new Color(253,253,253));
                g2d.fillOval(353,131,64,88);
                
                g2d.setColor(new Color(253,253,253));
                g2d.fill(rEye);
        
                g2d.setColor(new Color(37,37,39));
                g2d.fill(rbEye);
                g2d.setColor(new Color(37,37,39));
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(2F));
                g2d.draw(rbEye); 
                
                g2d.setColor(new Color(253,253,253));
                g2d.fillOval(488,108,78,89);
                
                g2d.setColor(new Color(253,253,253));
                g2d.fill(lEye);
                
                g2d.setColor(new Color(37,37,39));
                g2d.fill(lbEye);
                g2d.setColor(new Color(37,37,39));
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(2F));
                g2d.draw(lbEye);
                
                if(i % 2 == 0)
                    x = 2;
                else 
                    x = -2;
                
                //RIGHT IRIS
                if(i != 10)
                {
                    g2d.translate(x,0);
                }
                
                g2d.setColor(new Color(60,54,56));
                g2d.fillOval(371,140,41,75);

                g2d.setColor(new Color(253,253,253));
                g2d.fillOval(371,151,19,23);

                g2d.setColor(new Color(198,129,92));
                g2d.fill(rIris);
                //LEFT IRIS
                
                g2d.setColor(new Color(60,54,56));
                g2d.fillOval(494,120,47,75);
            
                g2d.setColor(new Color(253,253,253));
                g2d.fillOval(495,129,21,21);
                
                g2d.setColor(new Color(198,129,92));
                g2d.fill(lIris);
                
                if(i != 10)
                {
                    g2d.translate(-x,0);
                }
        
                Thread.sleep(950L);
                
                i++;
                }
                while(i < 5);
        
            Thread.sleep(400L);

            // Reset (no animation/change eye color/place aura)
            
            // Blink Screen White
            g2d.setColor(Color.white);
            g2d.fillRect(0,0,850,510);

            Thread.sleep(150L);

            g2d.setColor(new Color(65,65,65));
            g2d.fillRect(0,0,850,510);

            g2d.setColor(new Color(255, 91,0));         // Bright Orange
            g2d.fill(aura);

            g2d.setColor(new Color(93,137,86));
            g2d.fill(rGreenHair);

            g2d.setColor(new Color(93,137,86));
            g2d.fill(lGreenHair);

            g2d.setColor(new Color(37,37,39));
            g2d.fill(hair);

            g2d.setColor(new Color(251,228,197));
            g2d.fill(face);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(face);

            g2d.setColor(new Color(251,228,197));
            g2d.fill(rEar);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rEar);

            g2d.setColor(new Color(251,228,197));
            g2d.fill(neck);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(neck);

            g2d.setColor(new Color(211,70,50));
            g2d.fill(rRed);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rRed);

            g2d.setColor(new Color(32,84,48));
            g2d.fill(rDGreen);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rDGreen);

            g2d.setColor(new Color(94,197,80));
            g2d.fill(rGreen);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rGreen);

            g2d.setColor(new Color(211,70,50));
            g2d.fill(lRed);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lRed);

            g2d.setColor(new Color(32,84,48));
            g2d.fill(lDGreen);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lDGreen);

            g2d.setColor(new Color(94,197,80));
            g2d.fill(lGreen);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lGreen);

            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.fill(nose);

            g2d.setColor(new Color(239,169,167));
            g2d.fill(tongue);
            g2d.setStroke(new BasicStroke(2F));
            g2d.setColor(new Color(37,37,39));
            g2d.draw(tongue);
        
            g2d.setColor(new Color(37,37,39));
            g2d.fill(lEyebrow);
            g2d.setColor(new Color(37,37,39));
            g2d.setColor(Color.black);
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lEyebrow);

            g2d.setColor(new Color(37,37,39));
            g2d.fill(rEyebrow);
            g2d.setColor(new Color(37,37,39));
            g2d.setColor(Color.black);
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rEyebrow);

            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(line);

            g2d.setColor(new Color(253,253,253));
            g2d.fillOval(353,131,64,88);
                    
            g2d.setColor(new Color(253,253,253));
            g2d.fill(rEye);

            g2d.setColor(new Color(37,37,39));
            g2d.fill(rbEye);
            g2d.setColor(new Color(37,37,39));
            g2d.setColor(Color.black);
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rbEye);

            g2d.setColor(new Color(60,54,56));
            g2d.fillOval(371,140,41,75);
            
            g2d.setColor(new Color(253,253,253));
            g2d.fillOval(371,151,19,23);
            
            g2d.setColor(new Color(255, 91,0));
            g2d.fill(rIris);

            g2d.setColor(new Color(253,253,253));
            g2d.fillOval(488,108,78,89);

            g2d.setColor(new Color(253,253,253));
            g2d.fill(lEye);

            g2d.setColor(new Color(60,54,56));
            g2d.fillOval(494,120,47,75);
            
            g2d.setColor(new Color(253,253,253));
            g2d.fillOval(495,129,21,21);

            g2d.setColor(new Color(37,37,39));
            g2d.fill(lbEye);
            g2d.setColor(new Color(37,37,39));
            g2d.setColor(Color.black);
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lbEye);

            g2d.setColor(new Color(60,54,56));
            g2d.fillOval(494,120,47,75);
            
            g2d.setColor(new Color(253,253,253));
            g2d.fillOval(495,129,21,21);
        
            // Color Change
            g2d.setColor(new Color(255, 91,0)); 
            g2d.fill(lIris);   

            g2d.setColor(new Color(251,228,197));
            g2d.fill(lHand);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lHand);

            g2d.setColor(new Color(236,237,219));
            g2d.fill(lWPN);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lWPN);

            g2d.setColor(new Color(100,95,99));
            g2d.fill(lWPNg);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(lWPNg);

            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(line2);

            g2d.setColor(new Color(251,228,197));
            g2d.fill(rHand);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rHand);

            g2d.setColor(new Color(236,237,219));
            g2d.fill(rWPN);
            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(rWPN);

            g2d.setColor(new Color(37,37,39));
            g2d.setStroke(new BasicStroke(2F));
            g2d.draw(line3);
        }
        catch (InterruptedException ex) 
        {
                //Logger.getLogger(ParaynoCartoon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class MyFinishWindow extends WindowAdapter
{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}