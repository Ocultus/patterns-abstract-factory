class Msi : ComputerHardwareFactory {
    override fun createPowerUnit(): PowerSupply {
        return A850F()
    }

    override fun createVideoCard(): VideoCard {
        return RX6800()
    }

    override fun createMotherboard(): Motherboard {
        return B550()
    }
}