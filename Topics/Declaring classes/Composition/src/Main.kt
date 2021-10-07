data class OperatingSystem(var name: String = "Windows")
val opsys = OperatingSystem()
data class DualBoot(var primaryOs: OperatingSystem = opsys, var secondaryOs: OperatingSystem = opsys)