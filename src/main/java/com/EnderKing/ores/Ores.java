package com.EnderKing.ores;

import java.util.Random;

import com.EnderKing.MBlocks.MBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Ores implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(random, chunkX * 16, chunkZ *16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ *16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ *16, world);
			break;
		}

	}
	
	public void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
		
			new WorldGenMinable(block, (minVein + random.nextInt(maxVein - minVein)), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
	
	}
	
	public void generateEnd(Random random, int chunkX, int chunkZ, World world) {

		

	}

	public void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		
		addOre(MBlocks.ChickenOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 100, 5, 10, 15);
		addOre(MBlocks.SteakOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 100, 5, 10, 15);
		addOre(MBlocks.PorkOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 100, 5, 10, 15);
		addOre(MBlocks.BoneOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 60, 5, 10, 15);
		addOre(MBlocks.StringOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 60, 5, 10, 15);
		addOre(Blocks.coal_block, Blocks.stone, random, world, chunkX, chunkZ, 1, 100, 5, 10, 25);
		addOre(MBlocks.ObsidianOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 50, 5, 10, 15);
		addOre(MBlocks.GreenOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 30, 5, 10, 15);
		addOre(MBlocks.GPOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 50, 5, 10, 15);
		addOre(MBlocks.SlimeOre, Blocks.stone, random, world, chunkX, chunkZ, 1, 30, 5, 10, 15);
		addOre(MBlocks.ROre, Blocks.stone, random, world, chunkX, chunkZ, 1, 30, 5, 10, 15);

	}

	public void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
		

	}

}
