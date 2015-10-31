package com.EnderKing.ores;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGeneration {
	public static void MainRegistry(){
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen (){
		registerWorldGen(new Ores(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
