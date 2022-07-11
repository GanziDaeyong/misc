const { expect } = require("chai");
const { ethers } = require("hardhat");

describe("construction test", function(){
    it("should be 100", async function(){
        const Obj = await ethers.getContractFactory("Counter");
        const hardhatObj = await Obj.deploy();
        const valueA = 100;
        const valueB = await hardhatObj.get();
        expect(valueB).to.equal(valueA);
    });
});

describe("up test", function(){
  it("should be 101", async function(){
      const Obj = await ethers.getContractFactory("Counter");
      const hardhatObj = await Obj.deploy();

      const valueA = 101;
      await hardhatObj.inc();
      const valueB = await hardhatObj.get();

      expect(valueB).to.equal(valueA);
  });
});

describe("down test", function(){
    it("should be 101", async function(){
        const Obj = await ethers.getContractFactory("Counter");
        const hardhatObj = await Obj.deploy();
  
        const valueA = 99;
        await hardhatObj.dec();
        const valueB = await hardhatObj.get();
  
        expect(valueB).to.equal(valueA);
    });
  });