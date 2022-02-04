  	def call(Map config = [:]) {
    sh "cd cloudformation && aws cloudformation create-stack --stack-name  ismaeelawsclitest2 --template-body file://ismaeelstack.yml --region us-east-1  --parameters ParameterKey=ImageId,ParameterValue=${config.ImageId} ParameterKey=InstanceType,ParameterValue=${config.InstanceType}"
}
