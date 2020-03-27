package aula13_Enum_Composocao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.CommentPost;
import entities.Post;

public class PostMain {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.print("Momento = ");
		Date date = sdf.parse(sc.nextLine());

		System.out.print("title = ");
		String title = sc.nextLine();

		System.out.print("content = ");
		String content = sc.nextLine();

		System.out.print("likes = ");
		int likes = sc.nextInt();

		Post post = new Post(date, title, content, likes);

		System.out.print("text = ");
		sc.nextLine();
		String text = sc.nextLine();
		CommentPost c1 = new CommentPost(text);
		post.addComment(c1);

		System.out.print("text = ");
		text = sc.nextLine();
		CommentPost c2 = new CommentPost(text);
		post.addComment(c2);
		
		System.out.println(post);
		sc.close();
	}
}
