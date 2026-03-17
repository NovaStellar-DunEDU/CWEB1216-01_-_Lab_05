using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace OperationsUnitTesting
{
    [TestClass]
    public class operationsTest1
    {
        [TestMethod]
        public void CtFTest()
        {
            double expectedOutput = 32.00;
            double celcius = 0.00;

            double actualResult = OperationsLibrary.TemperatureConverter.CtF(celcius);

            Assert.AreEqual(expectedOutput, actualResult);
        }

        [TestMethod]
        public void FtCTest() 
        {
            double expectedOutput = 0.00;
            double fahrenheit = 32.00;

            double actualResult = OperationsLibrary.TemperatureConverter.FtC(fahrenheit);

            Assert.AreEqual(expectedOutput, actualResult);
        }
    }
}
