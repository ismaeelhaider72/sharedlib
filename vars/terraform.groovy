def call1(Map config = [:]) {
    sh "terraform plan -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType}"
}

def call2(Map config = [:]) {
    sh "terraform apply -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType} -auto-approve -lock=false "
}
