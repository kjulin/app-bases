#Skeleton for AWS Lambda function

1. Modify package.json to suit your function
2. Create Lambda function using web console.
3. Copy function arn from web console to Gruntfile.js
4. Run `npm install`
4. Run `grunt lambda_invoke` to invoke locally
5. Run `grunt deploy` to deploy.

Uses grunt-aws-lambda to make development easier.
https://aws.amazon.com/blogs/compute/continuous-integration-deployment-for-aws-lambda-functions-with-jenkins-and-grunt-part-1/
