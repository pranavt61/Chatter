function swap()
{
	var body = document.getElementsByTagName('body')[0];
	var button = document.getElementById("swapButton");
	var chatter = document.getElementById("chatter");
	var title = document.getElementById("chatterTitle");

	if(button.innerHTML == 'view')
	{

		button.innerHTML = 'edit';

		var chatterTitleView = document.createElement("h3");
		chatterTitle.innerHTML = title.innerHTML;

		var chatterView = document.createElement("p");
		chatterView.setAttribute('id', 'chatter');
		chatterView.innerHTML = chatter.innerHTML;
		
		document.getElementById("chatterForm").remove();

		body.insertBefore(chatterView, document.getElementById('logOutButton'));

	}
	else
	{
		button.innerHTML = 'view';
		var form = document.createElement("form");
		form.setAttribute('method', 'post');
		form.setAttribute('action', 'Chatter');
		form.setAttribute('id', 'chatterForm');

		var chatterTitleView = document.createElement("");

		var textBox = document.createElement("textarea");
		textBox.setAttribute('name', 'chatterText');
		textBox.setAttribute('id', 'chatter');
		textBox.setAttribute('rows', '10');
		textBox.setAttribute('cols', '30');
		textBox.innerHTML = chatter.innerHTML;

		var br = document.createElement("br");

		var submitButton = document.createElement("input");
		submitButton.setAttribute('type', 'submit');
		submitButton.setAttribute('value', 'Submit');

		form.appendChild(textBox);
		form.appendChild(br);
		form.appendChild(submitButton);

		body.insertBefore(form, document.getElementById('logOutButton'));

		chatter.remove();
	}
}