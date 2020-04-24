var pieCanvas = document.createElement("canvas");
pieCanvas.width = "500";
pieCanvas.height = "500";

var categories = ['Dairy', 'Fruits', 'Lean meats', 'Vegetables', 'Whole grains'];
var percentages = [27.92, 17.53, 14.94, 26.62, 12.99];

var ctx = pieCanvas.getContext('2d');
var myChart = new Chart(ctx, {
    type: 'pie',
    data: {
        labels: categories,
        datasets: [{
            data: percentages,
            backgroundColor: ['#e91e63', '#00e676', '#ff5722', '#1e88e5', '#ffd600'],
            borderWidth: 0.5 ,
            borderColor: '#ddd'
        }]
    },
    options: {
        responsive: false,
        maintainAspectRatio: false,
        title: {
            display: true,
            text: 'Recommended Daily Diet',
            position: 'top',
            fontSize: 16,
            fontColor: '#111',
            padding: 20
        },
        legend: {
            display: true,
            position: 'bottom',
            labels: {
                boxWidth: 20,
                fontColor: '#111',
                padding: 15
            }
        },
        tooltips: {
            enabled: false
        },
        
        labels: {
            render: 'percentage',
            fontColor: function (data) {
              var rgb = hexToRgb(data.dataset.backgroundColor[data.index]);
              var threshold = 140;
              var luminance = 0.299 * rgb.r + 0.587 * rgb.g + 0.114 * rgb.b;
              return luminance > threshold ? 'black' : 'white';
            },
            precision: 2
          }
        
    }
});

document.body.appendChild(pieCanvas);