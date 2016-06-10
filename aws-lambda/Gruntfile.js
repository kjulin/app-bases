var grunt = require('grunt');
grunt.loadNpmTasks('grunt-aws-lambda');

grunt.initConfig({
   lambda_invoke: {
      default: {
         options: {
            file_name: 'index.js'
         }
      }
   },
   lambda_deploy: {
      default: {
         arn: 'copy your function arn here'
      },
      options: {
        enableVersioning: true,
        region: 'eu-west-1'
      }
   },
   lambda_package: {
      default: {
   }
   }
});

grunt.registerTask('deploy', ['lambda_package', 'lambda_deploy'])
