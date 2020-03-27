package aula13_Enum_Composocao;

import java.util.Date;

import entities.Order;
import enums.OrderEnum;

public class OrderMain {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderEnum.PENDING_PAYMENT);

		System.out.println(order);

		OrderEnum orderEnum1 = OrderEnum.DELIVERED;

		OrderEnum orderEnum2 = OrderEnum.valueOf("DELIVERED");

		System.out.println(orderEnum1);
		System.out.println(orderEnum2);

	}

}
