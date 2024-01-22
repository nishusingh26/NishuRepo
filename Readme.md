<h3>Recreate Deployment</h3> 
<li>Version A is terminated then version B is rolled out</li>
<h2>1. First create VPC and Subnet (Public and Private)</h2>
<h2>2. Secoundly create Internet Gateway and NAT Gateway</h2>
<h2>3. You have to create Route table (Public) edit route, add the route from Internet Gateway and associate it with Public Subnet.</h2>
<h2>4. You have to create Route table (Private) edit route, add the route from Nat Gateway and associate it with Private Subnet.</h2>
