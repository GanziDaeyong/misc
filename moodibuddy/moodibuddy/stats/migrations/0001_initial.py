# Generated by Django 3.1 on 2021-02-22 13:53

from django.conf import settings
import django.contrib.postgres.fields
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
    ]

    operations = [
        migrations.CreateModel(
            name='WeeklyMood',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('yearWeek', models.CharField(max_length=30)),
                ('wkmd', django.contrib.postgres.fields.ArrayField(base_field=models.FloatField(), null=True, size=14)),
                ('avg', models.SmallIntegerField(null=True)),
                ('user', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='user_wkmd', to=settings.AUTH_USER_MODEL)),
            ],
        ),
    ]
