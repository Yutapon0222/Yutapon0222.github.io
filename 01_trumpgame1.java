package yusuke_super_intro;

//�p�b�P�[�W���uScanner�v���L�q�@5.4
import java.util.Scanner;

/*    */ public class HighAndLowS07 {
	//1~9�͈̔͂ŁA���̑召�𓖂Ă�Q�[���B
	//�E���̐����������傫���Ɨ\�z����ꍇ��h�A
	//�������Ɨ\�z����ꍇ��l��I������B
	//�f�[�^�^�AString�^�@5.4.2
/*    */    public static void main(String[] args) {
	//Scanner�ɕϐ�sc����́Anew Scanner(System.in)�ɂăL�[�{�[�h���͏����̉��n�Â���
/*  9 */       Scanner sc = new Scanner(System.in);
/*    */
/* 11 */       System.out.print("**************\n");
/* 12 */       System.out.print("* High & Low *\n");
/* 13 */       System.out.print("**************\n");
/*    */
//while����p���āA���[�v�����̏�������ݒ�B
//result�̌��ʂ�select�ɒ�`�����l�Ɠ����ł���΃��[�v�B�B6.5.2
/*    */       while(true) {
	//int�^�ϐ���leftCard,rightCard���`�B
	//random�ϐ����`���A*�u9.0D+1�v�ł��ꂼ���1�`9�̒l�������_���ŕ\�������B
/* 17 */          int leftCard = (int)(Math.random() * 9.0D) + 1;
/*    */
/* 19 */          int rightCard = (int)(Math.random() * 9.0D) + 1;
/*    */
/* 21 */          System.out.print(" \n[���\��]\n");
/* 22 */          System.out.print("***** *****\n");
/* 23 */          System.out.print("*   * *   *\n");
/* 24 */          System.out.print("* " + leftCard + " * * * *\n");
/* 25 */          System.out.print("*   * *   *\n");
/* 26 */          System.out.print("***** *****\n");
/*    */
//���́E�ϐ�select���`�Bsc.nextLine()�Œl����́@5.4.2
/* 28 */          System.out.print("High or Low ? (h/l) > ");
/* 29 */          String select = sc.nextLine();
/* 30 */          if(select.equals("h")) {
/* 31 */             System.out.print("��High��I�����܂����B\n");
/* 32 */          } else if(select.equals("l")) {
/* 33 */             System.out.print("��Low��I�����܂����B\n");
/*    */          } else {
/* 35 */             System.out.print("��h��l��I�����Ă��������B\n");
/*    */          }
/*    */
/* 38 */          System.out.print(" [���ʕ\��]\n");
/* 39 */          System.out.print("***** *****\n");
/* 40 */          System.out.print("*   * *   *\n");
/* 41 */          System.out.print("* " + leftCard + " * * " + rightCard + " *\n");
/* 42 */          System.out.print("*   * *   *\n");
/* 43 */          System.out.print("***** *****\n");
/*    *///�ϐ�result���`�BString�^�ϐ��ɑ��
//result��h��������ꂽ�ꍇ�Ah�̂Ƃ�left<right�ł���΂��邢��l�̂Ƃ��t�ł����
/*    */          String result;
/* 46 */          if(leftCard < rightCard) {
/* 47 */             result = "h";
/*    */
/* 49 */          } else if(leftCard > rightCard) {
/* 50 */             result = "l";
/*    */          } else {
/* 52 */             result = select;
/*    */          }
/* 54 */          if(result.equals(select)) {
/* 55 */          System.out.print("you win!");
					}else {
/*    */
/* 57 */             System.out.print("you lose!");
/*    */
/*    */
/*    */
/* 61 */             System.out.print("\n**�Q�[���I��**");
/*    *///return�ɂă��[�v���邪�A65�s�ȍ~�̕��͂ɓ��͂��������Ȃ��ׁA�v���O���������B
/* 63 */             return;
/*    */       }
/*    */    }
/*    */ }
}