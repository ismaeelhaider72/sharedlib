  	def call(Map config = [:]) {
    sh "terraform apply -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType} -auto-approve -lock=false "
}
