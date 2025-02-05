package huangduValley.farm.test;

import java.util.ArrayList;
import java.util.List;

import huangduValley.farm.land.DryLand;
import huangduValley.farm.land.Land;
import huangduValley.farm.land.LandCommand;

/**
 * @ClassName:CommandTest
 * @Description:to test design pattern huangduValley.farm.command
 * @author CuiYanshen
 */

public class Test_Command {
	
	public static void excuteCommand(List<LandCommand> queue) {
		for (LandCommand lc:queue) {
			lc.excute();
		}
	}
	
	public static void main(String[] args) {
		Land land = new DryLand();
		
		List<LandCommand> queue = new ArrayList<>();
		
		queue.add(new LandCommand(land, "water"));
		queue.add(new LandCommand(land, "fertilize"));
		queue.add(new LandCommand(land, "water"));
		queue.add(new LandCommand(land, "fertilize"));
		
		excuteCommand(queue);
	}
	
}
