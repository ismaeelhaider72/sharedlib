def plan(Map config = [:]) {
    sh "terraform plan -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType}"
}

def apply(Map config = [:]) {
    sh "terraform apply -no-color -var imageId=${config.ImageId} -var instanceType=${config.InstanceType} -auto-approve -lock=false "
}
