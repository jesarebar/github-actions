package es.codeurjc.ais.e2e.rest;

import es.codeurjc.ais.Item;
import es.codeurjc.ais.ItemsRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {

	@Test
	public void postItemTest() throws Exception {

		// GIVEN

		ItemsRepository itemsRepository = new ItemsRepository();

		Item item = new Item();
		String itemDescription = "Tomate";
		boolean itemCheked = false;
		item.setDescription(itemDescription);
		item.setChecked(itemCheked);

		// WHEN

		Item postedItem = itemsRepository.postItem(item);
		
		// THEN

		assertThat(postedItem.getDescription()).isEqualTo(itemDescription);
	}
	}
