  	def call(Map config = [:]) {
    sh "terraform plan -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType}"
}
