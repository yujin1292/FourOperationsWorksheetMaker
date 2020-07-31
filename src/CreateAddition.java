import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;


public class CreateAddition extends Create {
    CreateAddition(int a, int b, int p){
        first = a;
        second = b;
        page = p;
        op = "+";
    }


    @Override

    public boolean makePDFPage()throws Exception {
        int left, right;

        String filename = "addition"+ System.currentTimeMillis()%10000+".pdf";
        Number number = new Number();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();


        for (int i = 0; i < page; i++) {
            Paragraph preface = new Paragraph();

            // 제목 생성
            BaseFont objBaseFont = BaseFont.createFont("H2HDRM.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Paragraph title = new Paragraph("덧셈연습", new Font(objBaseFont, 18, Font.BOLD));
            title.setAlignment(Paragraph.ALIGN_CENTER); // 가운데 정렬.

            Image image2 = Image.getInstance("line.png");
            image2.setAlignment(Image.ALIGN_CENTER); // 가운데 정렬

            Paragraph blank = new Paragraph("  " , new Font(objBaseFont, 15, Font.BOLD));
            blank.setAlignment(Paragraph.ALIGN_CENTER); // 가운데 정렬.

            //제목 삽입
            preface.add(title);
            preface.add(image2);
            preface.add(blank);



            for(int row = 0 ; row < 4 ; row ++){

                // 표 생성
                PdfPTable table = new PdfPTable(new float[]{1f, 1f, 1f, 1f, 1f, 1f, 1f ,1f,  1f});

                PdfPCell c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                //수 생성
                int q1left, q1right, q2left, q2right;
                q1left = number.makeDigit(first);
                q2left = number.makeDigit(first);
                q1right = number.makeDigit(second);
                q2right = number.makeDigit(second);

                if( q1left < q1right){
                    int temp = q1right;
                    q1right = q1left;
                    q1left = temp;
                }
                if( q2left < q2right){
                    int temp = q2right;
                    q2right = q2left;
                    q2left = temp;
                }


                // 표 그리기 시작
                // 문제 1 생성
                int d = 100;
                for(int dd= 0 ; dd< 3 ; dd++){

                    if( 3-dd <= first ){ //숫자 출력
                        c1 = new PdfPCell(new Phrase(Integer.toString(q1left/d), new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                        q1left %= d;
                    }
                    else{ // 공백 출력
                        c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                    }
                    d/=10;
                }

                c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                // 문제 2 생성
                c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                d = 100;
                for(int dd= 0 ; dd< 3 ; dd++){

                    if( 3-dd <= first ){
                        c1 = new PdfPCell(new Phrase(Integer.toString(q2left/d), new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                        q2left %= d;
                    }
                    else{
                        c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                    }
                    d/=10;
                }

                table.setHeaderRows(1);

                // 다음줄

                c1 = new PdfPCell(new Paragraph(op, new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                d = 100;
                for(int dd= 0 ; dd< 3 ; dd++){

                    if( 3-dd <= second ){
                        c1 = new PdfPCell(new Phrase(Integer.toString(q1right/d), new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                        q1right %= d;
                    }
                    else{
                        c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                    }
                    d/=10;
                }


                c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                c1 = new PdfPCell(new Paragraph(op, new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);

                d = 100;
                for(int dd= 0 ; dd< 3 ; dd++){

                    if( 3-dd <= second){
                        c1 = new PdfPCell(new Phrase(Integer.toString(q2right/d), new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                        q2right %= d;
                    }
                    else{
                        c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        c1.setBorder(Rectangle.NO_BORDER);
                        table.addCell(c1);
                    }
                    d/=10;
                }


                for( int t = 0 ; t < 9 ; t++){
                    c1 = new PdfPCell(new Phrase(" ", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.TOP);
                    if( t == 4)
                        c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                }

                preface.add(table);
                if( row == 3)
                    continue;
                preface.add(blank);
                preface.add(blank);
                preface.add(blank);
                preface.add(blank);
            }

            // preface에 추가합니다.



            // preface를 document에 저장합니다.
            document.add(preface);
            document.newPage();

        }
        document.close();

        return true;

    }

}



