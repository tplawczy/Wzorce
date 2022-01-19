package builder2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;




public class TestBuilder {

	@Test
	public final void TestBuilderNewObject() {
		Builder busBuilder = new Citybus();
		Director busDirector = new Director(busBuilder);
		busDirector.buildBus();
		Bus citybus = busDirector.getBus();
		
		Assert.assertEquals("Low",citybus.getFlor().getType());
		Assert.assertEquals("Hybrid",citybus.getEngine().getType());
		Assert.assertEquals(0,citybus.getEngine().getCapacity());
		Assert.assertEquals("Long body",citybus.getBody().getType());
		Assert.assertEquals("No Armour",citybus.getArmour().getType());
		Assert.assertEquals("[Monitoring, SeatBelts]",citybus.getAccessorries().name.toString());		
	}
}


